//https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        // finding length of the linkedlist the iteration till the middle
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        temp = head;
        for(int i=0;i<count/2;i++)
        {
           temp = temp.next; 
        }
        return temp;
        
        // slow fast pointer appoach
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
