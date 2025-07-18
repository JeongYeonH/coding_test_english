package leetcode.Med;

import leetcode.Objects.Add_Two_Numbers.ListNode;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode begin = new ListNode(0);
        ListNode curr = begin;
        int carry = 0;
        while( l1 !=null || l2 !=null || carry !=0){
            int fst = (l1 != null) ? l1.val : 0;
            int sec = (l2 != null) ? l2.val : 0;

            int sum = fst + sec + carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return begin.next;
    }
}
