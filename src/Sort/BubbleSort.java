package Sort;

/**
 * Designed By PIGning
 *
 * @author:PIGning
 * @date:2019/8/19 11:59
 * @description:Sort Idea_SevenSort 冒泡排序
 */

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {34, 78, 12, 5, 88, 22, 67, 14};
        int newarr[] = bubbleSort(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+"\t");
        }

    }

    public static int[] bubbleSort(int[] origin){
        int len = origin.length;
        //sortTime:需要进行排序的元素的个数
        //排序到最后一个元素时已经不需要进行对比了，因此len-1
        for (int sortTime = 0; sortTime < len-1; sortTime++) {
            int notSort = len - sortTime;//未排序的元素个数，改进部分，让元素不再对比已经排序好的部分
            //compareTime:元素需要进行对比的次数
            //-1是为了防止数组越界
            for (int compareTime = 0; compareTime < notSort-1; compareTime++) {
                int middle = origin[0];
                if (origin[compareTime] > origin[compareTime + 1]) {
                    middle = origin[compareTime + 1];
                    origin[compareTime + 1] = origin[compareTime];
                    origin[compareTime] = middle;
                }
            }
        }
        return origin;
    }



}
