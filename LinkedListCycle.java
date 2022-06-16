
//https://leetcode.com/problems/linked-list-cycle/

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
    public boolean hasCycle(ListNode head) {
        
        // using HashSET
        
        HashSet<ListNode>set = new HashSet<>();
        while(head!=null)
        {
            if(set.contains(head))return true;
            else
                set.add(head);
            head=head.next;
        }
        return false;
        
        
        // using HashMAP
        
        HashMap<ListNode, Integer>map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(map.get(temp)==null)
            {
                map.put(temp,1);
                temp=temp.next;
            }
            else
            {
                return true;
            }
        }
    return false;
        
        // slow fast pointer approach
        
        ListNode slow = head,fast =head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    
}
