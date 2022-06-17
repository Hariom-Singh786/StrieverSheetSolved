
//https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	   // base case
	   if(root==null || root.next==null)
	   {
	       return root;
	   }
	   // recursion
	   root.next = flatten(root.next);
	   root = mergeTwoLists(root,root.next);
	   return root;
    }
    Node mergeTwoLists(Node l1, Node l2)
    {
        Node temp = new Node(0);
        Node res = temp;
        while(l1!=null && l2!=null)
        {
            if(l1.data<l2.data)
            {
                temp.bottom=l1;
                temp = temp.bottom;
                l1 = l1.bottom;
            }
            else
            {
                temp.bottom = l2;
                temp = temp.bottom;
                l2 = l2.bottom;
            }
        }
        if(l1!=null)
        {
            temp.bottom = l1;
        }
        else
        {
            temp.bottom = l2;
        }
        return res.bottom;
        
    }
}
