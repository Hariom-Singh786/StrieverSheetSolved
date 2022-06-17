//https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        //using extra space ArrayList
        ArrayList<ListNode>ls = new ArrayList<>();
        while(head!=null)
        {
            ls.add(head);
            head = head.next;
        }
        int size = ls.size();
        for(int i=0;i<size/2;i++)
        {
            if(ls.get(i).val != ls.get(size-i-1).val)
                return false;
        }
        return true;
         
        //optimed solution 
        
        ListNode mid= middleNode(head);
        ListNode headSecond =reverseList(mid);
        ListNode reverseHead = headSecond;
        while(head!=null && headSecond!=null)
        {
            if(head.val!=headSecond.val)
            {
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(reverseHead);
        return head==null || headSecond==null;
    }
    
    public ListNode middleNode(ListNode head)
    {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null)
        {
           slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode forward=pres.next;
        while(pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=forward;
            if(forward!=null)
            {
                forward=forward.next;
            }
        }
        return prev;
    }
}
