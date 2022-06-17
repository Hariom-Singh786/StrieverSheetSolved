//https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        
        // naive solution
        if(head == null || head.next == null)return head;
        for(int i=0;i<k;i++)
        {
            ListNode temp = head;
            while(temp.next.next!=null)temp = temp.next;
            ListNode end = temp.next;
            temp.next=null;
            end.next = head;
            head = end;
            
        }
        return head;
        
        //optimized solution
        if(head==null || head.next==null || k==0)return head;
        ListNode temp = head;
        int length = 1;
        while(temp.next !=null)
        {
            ++length;
            temp = temp.next;
        }
        temp.next = head;
        k = k%length;
        int end = length-k;
        while(end--!=0)temp=temp.next;
        head = temp.next;
        temp.next=null;
        return head;
    }
}

