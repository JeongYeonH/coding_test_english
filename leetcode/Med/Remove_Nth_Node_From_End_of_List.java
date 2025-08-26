package leetcode.Med;

import leetcode.Objects.Remove_Nth_Node_From_End_of_List.ListNode;

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode prior = dummy;
        ListNode post = dummy;

        for(int i = 0; i <= n; i++){
            prior = prior.next;
        }

        while(prior != null){
            prior = prior.next;
            post = post.next;
        }

        post.next = post.next.next;

        return dummy.next;
    }
}
