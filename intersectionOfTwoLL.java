//https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //optimized solution
        HashSet<ListNode>set = new HashSet<>();
        while(headA!=null)
        {
            set.add(headA);
            headA= headA.next;
        }
        while(headB!=null)
        {
            if(set.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;
        
        //naive approach
        
       while(headB!=null)
       {
           ListNode temp = headA;
           while(temp!=null)
           {
                if(temp==headB)return headB;
               temp = temp.next;
           }
           headB=headB.next;
       }
        return null;
    }
}
