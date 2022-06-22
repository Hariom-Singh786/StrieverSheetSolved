
//https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        // using lenear search
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return i;
        }
        return -1;
        
        // using binary search
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[lo]<=nums[mid])
            {
                if(nums[lo]<=target &&  nums[mid]>=target)
                {
                    hi = mid-1;
                }
                else
                {
                    lo = mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && target<=nums[hi])
                {
                    lo=mid+1;
                }
                else
                {
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}
