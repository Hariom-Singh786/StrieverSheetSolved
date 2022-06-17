//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        // naive appraoch
          HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            nums[j++] = x;
        }
        return k;
        
        //2 pointer approach
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
                i++;
            nums[i]=nums[j];
        }
        return i+1;
    }
}
