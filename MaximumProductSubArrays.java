//https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
      int p1=nums[0],p2=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int temp = Math.max(nums[i],Math.max(p1*nums[i],p2*nums[i]));
            p2= Math.min(nums[i],Math.min(p1*nums[i],p2*nums[i]));
            p1 = temp;
            res = Math.max(res,p1);
        }
        return res;
        // better approach
        int ans = Integer.MIN_VALUE;
        int prod =1;
        for(int i=0;i<nums.length;i++)
        {
            prod *= nums[i];
            ans = Math.max(ans,prod);
            if(prod==0)
            {
                prod=1;
            }
        }
        prod =1;
        for(int i=nums.length-1;i>=0;i--)
        {
            prod*=nums[i];
            ans = Math.max(ans,prod);
            if(prod==0)
            {
                prod=1;
            }
        }
        return ans;
    }
}
