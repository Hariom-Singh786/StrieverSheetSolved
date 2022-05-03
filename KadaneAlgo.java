class Solution {
    public int maxSubArray(int[] nums) {
        // optimized solution
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxsum= Math.max(maxsum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxsum;
      
        
         
        // TLE solution
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int currSum=0;
            for(int j=i;j<nums.length;j++)
            {
                currSum+=nums[j];
                if(currSum>maxi)
                {
                    maxi = currSum;
                }
                
            }
        }
        return maxi;
    }
}
        
