/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        // 3 pointers approach
        // base condition
         if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head= prev;
        return head;
        
        // recursive approach
       ListNode newHead = null;
        while(head!=null)
        {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head=next;
        }
        return newHead;
       
    }
}
