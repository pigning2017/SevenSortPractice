package Sort;

/**
 * Designed By PIGning
 *
 * @author:PIGning
 * @date:2019/9/20 9:34
 * @description:Sort Idea_SevenSort
 */

public class QuickSort {

    public static void main(String[] args) {
//        int[] s = {66, 87, 34, 78, 65, 54, 99};
        int[] s = new int[100];
        for (int i = 0; i < s.length; i++) {
            s[i] = (int) (Math.random() * 1000);
        }
        QuickSort.quick_sortSe(s, 0, s.length - 1);
        s = QuickSort.adjustArray(s, 0, s.length - 1);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }


    static int[] adjustArray(int[] s, int l, int r) {
        int i = l, j = r;
        int x = s[l];
        while (i < j) {
            while (i < j && s[j] > x) {
                j--;
            }
            //等于的情况下就不用变了
            if (i < j) {
                s[i] = s[j];
                i++;
            }
            while (i < j && s[i] < x) {
                i++;
            }
            if (i < j) {
                s[j] = s[i];
                j--;
            }
        }
        s[i] = x;
        if (l < i - 1 && i + 1 < r) {
            adjustArray(s, l, i - 1);
            adjustArray(s, i + 1, r);
        }
        return s;
    }

    static int returnNum(int[] s, int l, int r) {
        int i = l, j = r;
        int x = s[l];
        while (i < j) {
            while (i < j && x <= s[j]) {
                j--;
            }
            if (i < j) {
                s[i] = s[j];
                i++;
            }
            while (i < j && x >= s[i]) {
                i++;
            }
            if (i < j) {
                s[j] = s[i];
                j--;
            }
        }
        s[i] = x;
        System.out.println(x + ":|" + i);
        return i;
    }

    static int[] quick_sort(int[] s, int l, int r) {
        if (l < r) {
            int i = returnNum(s, l, r);
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }
        return s;
    }

    //快速排序
    static void quick_sortSe(int s[], int l, int r) {
        long startTime = System.currentTimeMillis();
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];//i会在s[i]=s[j]后再加1
                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
