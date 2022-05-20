class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
         int lo =0;
        int mid =0;
        int hi = n-1;
        while(mid<=hi)
        {
           switch(nums[mid])
           {
               case 0 : swap(nums,lo,mid);
                   lo++;
                   mid++;
                   break;
               case 1: mid++; break;
               case 2: swap(nums,mid,hi);
                        hi--;
                        break;
           }
        }
    }
    static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
