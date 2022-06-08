
static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        
        //kahn's algorithm
        int []topo = new int[V];
        int []indegree = new int[V];
        for(int i=0;i<V;i++)
        {
            for(Integer it:adj.get(i))
            {
                indegree[it]++;
            }
        }
        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int idx=0;
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            topo[idx++]=node;
            for(Integer n : adj.get(node))
            {
                indegree[n]--;
                if(indegree[n]==0)
                {
                    q.add(n);
                }
            }
        }
        return topo;
}
