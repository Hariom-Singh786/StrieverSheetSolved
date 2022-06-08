
//practice.geeksforgeeks.org/problems/topological-sort

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[]vis = new boolean[V];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                dfs(i,st,vis,adj);
            }
        }
        int []ans = new int[V];
        int i=0;
        while(!st.isEmpty())
        {
            ans[i++]=st.pop();
        }
         return ans;
    }
   public static void dfs(int node,Stack<Integer>st, boolean[]vis,ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        for(Integer it:adj.get(node))
        {
            if(!vis[it])
            {
                dfs(it,st,vis,adj);
            }
        }
        st.push(node);
    }
}
