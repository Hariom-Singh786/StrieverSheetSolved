//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        int [][]vis = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                vis[i][j]=0;
            }
        }
        ArrayList<String>ans = new ArrayList<>();
        if(m[0][0]==1)
            solve(0,0,m,vis,n,"",ans);
        return ans;    
    }
    static void solve(int row, int col, int [][]m, int [][]vis, int n, String move,ArrayList<String>ans)
    {
        if(row==n-1 && col==n-1)
        {
            ans.add(move);
            return;
        }
        //downward
        if(row+1<n && vis[row+1][col]==0 && m[row+1][col]==1)
        {
            vis[row][col]=1;
            solve(row+1,col,m,vis,n,move+'D',ans);
            vis[row][col]=0;
        }
        
        //left
        if(col-1>=0 && vis[row][col-1]==0 && m[row][col-1]==1)
        {
            vis[row][col]=1;
            solve(row,col-1,m,vis,n,move+'L',ans);
            vis[row][col]=0;
        }
        
        //right
        if(col+1<n && vis[row][col+1]==0 && m[row][col+1]==1)
        {
            vis[row][col]=1;
            solve(row,col+1,m,vis,n,move+'R',ans);
            vis[row][col]=0;
        }
        
        //upward
        if(row-1>=0 && vis[row-1][col]==0 && m[row-1][col]==1)
        {
            vis[row][col]=1;
            solve(row-1,col,m,vis,n,move+'U',ans);
            vis[row][col]=0;
        }
    }
}
