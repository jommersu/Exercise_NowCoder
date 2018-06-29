/*
合并两个排序的链表

输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。


 */

public class ListNodeMerge {
    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);

        ListNode result = merge(list1,list2);
        System.out.println(result.val +" "+ result.next.val + " " + result.next.next.val
            + " " + result.next.next.next.val );
    }

    public static ListNode merge(ListNode list1, ListNode list2){
        if(list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }

        ListNode head = list1.val <= list2.val ? list1 : list2;
        ListNode cur1 = head == list1 ? list1 : list2;
        ListNode cur2 = head == list1 ? list2 : list1;
        ListNode pre = null;
        ListNode next = null;

        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                pre = cur1;
                cur1 = cur1.next;
            }else {

                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }

        }
        pre.next = cur1 == null ? cur2 : cur1;
        return head;

    }
}
