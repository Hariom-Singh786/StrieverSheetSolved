class Node{
    int first;
    int second;
    public Node(int f, int s)
    {
        this.first= f;
        this.second=s;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[]vis = new boolean[V+1];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                if(cycleBFS(vis,adj,i))
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean cycleBFS(boolean[]vis,ArrayList<ArrayList<Integer>> adj,int s )
    {
        Queue<Node>q= new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s]=true;
        while(!q.isEmpty())
        {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer it:adj.get(node))
            {
                if(!vis[it])
                {
                    q.add(new Node(it,node));
                    vis[it]=true;
                }
                else if(par!=it)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
