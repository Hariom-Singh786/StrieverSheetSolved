
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
*/

class Solution {
    public int findDuplicate(int[] nums) {
     // 1 sort the array and check wether adjacent is same or not
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(nums[i-1]==nums[i])
        //     {
        //         return nums[i];
        //     }
        // }
        // return 0;
        
        // 2 using frequency array
        
        int n = nums.length;
        int []freq = new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(freq[nums[i]]==0)
            {
                freq[nums[i]]+=1;
            }
            else
            {
                return nums[i];
            }
        }
        return 0;
    }
}
