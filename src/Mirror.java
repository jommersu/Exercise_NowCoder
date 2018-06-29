/*
二叉树镜像

题目描述：
操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class Mirror {
    public static void main(String [] args) {

    }

    public static void Mirror (Treenode root){
        if (root == null) {
            return;
        }
        if (root.left == null & root.right == null) {
            return;
        }

        Treenode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }
}
