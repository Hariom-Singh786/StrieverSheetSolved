//https://leetcode.com/problems/two-sum/submissions/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int num = target-nums[i];
            if(map.containsKey(num))
            {
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
