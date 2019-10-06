package ArrayToBinaryTree;

/**
 * Designed By PIGning
 *
 * @author:PIGning
 * @date:2019/10/6 14:31
 * @description:ArrayToBinaryTree Idea_SevenSort
 */

public class demo {



    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7,8,9};
        TreeNode<Integer> root =  arrayToBinaryTree(test,0,8);
        System.out.println(findMax(root).toString());
        System.out.println(findMin(root).toString());
        System.out.println(inorderTraversal(root,new StringBuffer()).toString());
        System.out.println(preorderTraversal(root,new StringBuffer()).toString());
        System.out.println(postorderTraversal(root,new StringBuffer()).toString());

    }

    /**
     * 前序遍历
     * 根节点-》左子树-》右子树
     * @param root
     * @param buffer
     * @return
     */
    public static StringBuffer preorderTraversal(TreeNode root, StringBuffer buffer) {
        if (root!=null){
            buffer.append(root.toString()+"  ");
            preorderTraversal(root.getLeft(),buffer);
            preorderTraversal(root.getRight(),buffer);
        }
        return buffer;
    }

    /**
     * 中序遍历
     * 左子树-》根节点-》右子树
     * @param root
     * @param buffer
     * @return
     */
    public static StringBuffer inorderTraversal(TreeNode root, StringBuffer buffer) {
        if (root!=null){
            inorderTraversal(root.getLeft(),buffer);
            buffer.append(root.toString() + "  ");
            inorderTraversal(root.getRight(), buffer);
        }
        return buffer;
    }

    /**
     * 后序遍历
     * 左子树-》右子树-》根节点
     * @param root
     * @param buffer
     * @return
     */
    public static StringBuffer postorderTraversal(TreeNode root, StringBuffer buffer) {
        if (root!=null){
            inorderTraversal(root.getLeft(),buffer);
            inorderTraversal(root.getRight(), buffer);
            buffer.append(root.toString() + "  ");
        }
        return buffer;
    }


    /**
     * 有序数组变成二叉查找树
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public static TreeNode arrayToBinaryTree(int[] nums, int start, int end) {
        if (start<=end){
            if (nums.length==0){
                return null;
            }
            int middle = (start & end) + ((start ^ end) >> 1);
//            int middle = (end+start)/2;
            TreeNode root = new TreeNode(new Integer(nums[middle]));
            System.out.println(root.toString());
            root.setLeft(arrayToBinaryTree(nums,start,middle-1));
            root.setRight(arrayToBinaryTree(nums,middle+1,end));
            return root;
        }
        return null;
    }

    /**
     * 找最大值
     * @param root
     * @return
     */
    public static TreeNode findMax(TreeNode root){
        if (root == null) {
            return root;
        }
        if (root.getRight()!=null){
            return findMax(root.getRight());
        }else {
            return root;
        }
    }

    /**
     * 找最小值
     * @param root
     * @return
     */
    public static TreeNode findMin(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.getLeft() != null) {
            return findMin(root.getLeft());
        }else{
            return root;
        }
    }



    //没有给TreeNode赋值成整数型，因此没法用比较大小的contains（）方法
//    public static boolean contains
/**
 * 思路：
 * compare（）
 * if（result>0): return contains(root.right)
 * else if(result<0): return contains(root.left)
 * else: return true
 */

}
