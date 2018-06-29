/*
重建二叉树
利用前序和中序重建
前序：root-left-right
中序：left-root-right
后序：left-right-root
 */

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
则重建二叉树并返回。

 */
public class findTreeFromPreIn {

    /*
     Definition for binary tree
     */
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      }

      public static void main(String[] args){
         int[] pre = {1,2,3,4,5,6,7};
         int[] in = {3,2,4,1,6,5,7};
         System.out.println(reConstructBinaryTree(pre,in).val);
      }


    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }

        int left = 0;
        int right = in.length - 1;
        int index = 0;
        return findTreePreIn(pre, in, left, right,index);

    }

    public static TreeNode findTreePreIn(int[] pre, int[] in, int left, int right, int index) {
          if(left >right){
              return null;
          }
        int inHead = 0;
        TreeNode head = new TreeNode(pre[index]);
        for (int i = left; i <= right; i++) {
            if (head.val == in[i]) {
                inHead = i;
                break;
            }
        }
        head.left = findTreePreIn(pre, in, left , inHead - 1,index + 1);
        head.right = findTreePreIn(pre, in, inHead + 1, right, index + inHead- left + 1);
        return head;
    }
}
