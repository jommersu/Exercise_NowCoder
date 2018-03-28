/*
输入一个链表，从尾到头打印链表每个节点的值。
 */
import java.util.ArrayList;
import java.util.Stack;
public class printLinkNode {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }

        return arrayList;
    }
}

   public class ListNode {
        int val;
        ListNode next = null;
                ListNode(int val) {
            this.val = val;
        }
    }