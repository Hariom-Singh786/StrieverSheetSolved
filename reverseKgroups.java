
//https://leetcode.com/problems/reverse-nodes-in-k-group/
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        int len = getlen(head);
        int count = len/k;
        while(count>0)
        {
            ListNode next = curr.next;
            ListNode last = prev;
            ListNode newEnd = curr;
            for(int i=0;i<k && curr!=null;i++)
            {
                curr.next = prev;
                prev = curr;
                curr= next;
                if(next!=null)
                {
                    next= next.next;
                }
            }
            if(last!=null)
            {
                last.next = prev;
            }
            else
            {
                head = prev;
            }
            newEnd.next = curr;
            prev = newEnd;
            count--;
            
        }
        return head;
        
    }
    int getlen(ListNode head)
    {
        int len = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            temp = temp.next;
        }
        return len;
    }
    
}
