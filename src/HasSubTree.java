/*
树的子结构

输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

思路：遍历两棵树，如果值相等继续遍历，值不相等，开始遍历A树的左子树与B树，然后是A树的右子树与B树

在节点值相等的情况下，如果一直遍历到B树为空还没有退出，说明B是A的子树
一旦有不符合情况的就会跳出
如果遍历到A空了但是还没有跳出，说明B不是A的子树
 */
public class HasSubTree {
    public static void main(String[] args){

    }
    public static  boolean HasSubTree(Treenode root1, Treenode root2){
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = HasSubTree2(root1,root2);
            }
            if (!result) {
                result = HasSubTree(root1.left, root2);
            }
            if (!result) {
                result = HasSubTree(root1.right, root2);
            }
        }
        return result;
    }

    public static boolean HasSubTree2(Treenode root1, Treenode root2){
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }

        return HasSubTree2(root1.left, root2.left) && HasSubTree2(root1.right,root2.right);
    }
}

class Treenode {
    int val = 0;
    Treenode left = null;
    Treenode right = null;

    public Treenode(int val) {
        this.val = val;
    }
}