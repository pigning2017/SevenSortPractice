package ArrayToBinaryTree;

/**
 * Designed By PIGning
 *
 * @author:PIGning
 * @date:2019/10/6 14:34
 * @description:demo Idea_SevenSort
 */

public class TreeNode<T> {

    private T type;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(T type) {
        this.type = type;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
