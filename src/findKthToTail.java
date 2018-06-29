/*
链表中倒数第k个结点
输入一个链表，输出该链表中倒数第k个结点。

思路：
首先判断返回null的条件：k小于0或者给的链表为空
复制一个链表用来遍历，每次遍历将k-1
k==0时，说明k刚好是链表的长度，倒数第k个就是正数的第一个
k>0 说明，k比链表长度要长，所以不存在倒数第k个，返回空
k<0 说明，k比链表长度要短，此时可以返回到原来的链表上
遍历，每次k++，k加到0的时候刚好就是倒数第k个

注意判断条件是head != null

 */
public class findKthToTail {

    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;

        System.out.println(FindKthToTail(list1, 1).val);
    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k < 0){
            return null;
        }
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            k--;
        }
        if(k == 0){
            return head;
        }
        if(k > 0){
            return null;
        }
        if(k < 0){
            while(k != 0){
                head = head.next;
                k++;
            }
        }
        return head;

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}