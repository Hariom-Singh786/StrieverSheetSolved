//https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        int [][]dp = new int[nums.length+1][nums.length+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return recur(0,-1,nums,dp);
    }
    static int recur(int i, int prev, int[]nums, int [][]dp)
    {
        if(i==nums.length)
        {
            return 0;
        }
        if(dp[i][prev+1]!=-1)
        {
            return dp[i][prev+1];
        }
        // don't take 
        int len = 0 + recur(i+1,prev,nums,dp);
        //take
        if(prev==-1 || nums[i]>nums[prev])
        {
            len = Math.max(len,1+recur(i+1,i,nums,dp));
        }
        return dp[i][prev+1]=len;
    }
}
