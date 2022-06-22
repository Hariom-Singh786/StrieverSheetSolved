


class Solution {
    public int singleNonDuplicate(int[] nums) {
        // using binary search approach
        int lo = 0;
        int hi = nums.length-2;
        while(lo<=hi)
        {
            int mid = (hi+lo)/2;
            if(mid%2==0)
            {
                if(nums[mid]!=nums[mid+1])
                {
                    //search in the left side
                    hi = mid-1;
                }
                else
                {
                    // search into the right side
                    lo = mid+1;
                }
            }
            else
            {
                if(nums[mid]==nums[mid+1])
                {
                    hi = mid-1;
                }
                else
                {
                    lo = mid+1;
                }
            }
        }
        return nums[lo];
        
    }
}
