
//https://leetcode.com/problems/unique-paths/
class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m][n];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return dpFun(m-1,n-1,dp);
    }
    int dpFun(int i, int j, int[][]dp)
    {
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        else return dp[i][j]=dpFun(i-1,j,dp)+dpFun(i,j-1,dp);
    }
}

