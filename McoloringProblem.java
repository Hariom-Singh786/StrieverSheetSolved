
//https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#

class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int []col = new int[n];
       if(solve(0,graph,col,m,n))
            return true;
       return false;    

    }
    static boolean solve(int node,boolean[][]G,int []col,int m, int n)
    {
        if(node==n)
        {
            return true;
        }
        for(int i=1;i<=m;i++)
        {
            if(isSafe(node,G,col,n,i))
            {
                col[node]=i;
                if(solve(node+1,G,col,m,n))
                {
                    return true;
                }
              //backtrack
                col[node]=0;
            }
        }
        return false;
    }
    static boolean isSafe(int node , boolean[][]G, int[]col, int n , int color)
    {
      // traversing through the adjacent nodes of the graph
        for(int i=0;i<G.length;i++)
        {
            if(G[node][i])
            {
                if(col[i]==color)
                    return false;
            }
        
        }
        return true;
    }
}
