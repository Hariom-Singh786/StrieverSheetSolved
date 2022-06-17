
//https://leetcode.com/problems/copy-list-with-random-pointer/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // solution in three steps
        //1
        copylist(head);
        //2
        copyRandomPtr(head);
        //3
        return seperateList(head);
    }
    public void copylist(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            Node newnode = new Node(curr.val);
            newnode.next = curr.next;
            curr.next=newnode;
            curr= curr.next.next;
        }
    }
    public void copyRandomPtr(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            if(curr.random!=null)
            {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
    }
    public Node seperateList(Node head)
    {
        Node newHead = new Node(0);
        Node dummy = newHead;
        Node curr=head;
        while(curr!=null)
        {
            dummy.next = curr.next;
            dummy = dummy.next;
            curr.next = curr.next.next;
            curr= curr.next;
        }
        return newHead.next;
    }
}
