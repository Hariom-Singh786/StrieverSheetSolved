//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1#
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer>st = new Stack<>();
    	for(int i=0;i<n;i++)
    	{
    	    st.push(i);
    	}
    	while(st.size()>=2)
    	{
    	    int i=st.pop();
    	    int j=st.pop();
    	    if(M[i][j]==1)
    	    {
    	        //i knows j -> i is not a celebrity
    	        st.push(j);
    	    }
    	    else
    	    {
    	        st.push(i);
    	    }
    	}
    	int potential = st.pop();
    	for(int i=0;i<n;i++)
    	{
    	    if(i!=potential)
    	    {
    	        if(M[i][potential]==0 || M[potential][i]==1)
    	        {
    	            // potential is not a celebrity
    	            return -1;
    	        }
    	    }
    	}
    	// potential is a celebrity
    	return potential;
    }
}
