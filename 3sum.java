//https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // naive approach
        List<List<Integer>>res = new ArrayList<>();
        int i,j,k;
        int n = nums.length;
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    List<Integer> item = new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[k]);
                    }
                    if(item.size()!=0)
                    {
                        res.add(item);
                    }
                }
            }
        }
        return res;
        
        //optimed solution
        
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        int n= nums.length;
        for(int i=0;i<n-2;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int lo =i+1,hi=n-1,sum=0-nums[i];
                while(lo<hi)
                {
                    if(nums[lo]+nums[hi]==sum)
                    {
                        List<Integer>item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[lo]);
                        item.add(nums[hi]);
                        ans.add(item);
                        while(lo<hi && nums[lo]==nums[lo+1])lo++;
                        while(lo<hi && nums[hi]==nums[hi-1])hi--;
                        lo++;
                        hi--;
                    }
                    else if(nums[lo]+nums[hi]<sum)
                    {
                        lo++;
                    }
                    else
                    {
                        hi--;
                    }
                }
            }
        }
        return ans;
    }
}
