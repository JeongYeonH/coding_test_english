package leetcode.Hard;

import java.util.PriorityQueue;
import leetcode.Objects.Merge_k_Sorted_Lists.ListNode;

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        PriorityQueue<ListNode> pQ = new PriorityQueue<>((a, b) ->a.val - b.val);
        
        for(int i = 0; i < lists.length; i++){
            if(lists[i] == null) continue;
            ListNode node = lists[i];
            pQ.offer(node);            
        }

        if(pQ.isEmpty()) return null;

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(!pQ.isEmpty()){
            ListNode pQ_node = pQ.poll();
            curr.next = pQ_node;
            curr = pQ_node;
            pQ_node = pQ_node.next;

            if(pQ_node != null){
                pQ.offer(pQ_node);
            }
        }

        return dummy.next;
    }
}
