/*
输入一个链表，反转链表后，输出链表的所有元素。
 */

public class reverseList {
    public static void main(String[] args) {
        ListNode list = new ListNode(5);
        list.next = new ListNode(7);
        list.next.next = new ListNode(8);

        ListNode now = reverseList(list);

        for (int i = 0; i < 3; i++ ) {
            System.out.println(now.val);
            now = now.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

/*class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/