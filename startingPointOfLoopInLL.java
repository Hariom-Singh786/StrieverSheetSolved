//https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         // naive approach
        HashSet<ListNode>set = new HashSet<>();
        while(head!=null)
        {
            if(set.contains(head))return head;
            set.add(head);
            head = head.next;
        }
        return null;
        
        // optimed solution
        ListNode slow = head,fast=head,entry=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                while(entry!=slow)
                {
                    entry= entry.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
