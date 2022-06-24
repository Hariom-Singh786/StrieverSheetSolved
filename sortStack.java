//https://practice.geeksforgeeks.org/problems/sort-a-stack/1#

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if(!s.isEmpty())
		{
		    int x = s.pop();
		    sort(s);
		    insertSorted(s,x);
		}
		return s;
	}
	public static void insertSorted(Stack<Integer>s, int x)
	{
	    if(s.isEmpty() || s.peek()<=x)
	    {
	        s.push(x);
	        return;
	    }
	    int temp = s.pop();
	    insertSorted(s,x);
	    s.push(temp);
	}
}
