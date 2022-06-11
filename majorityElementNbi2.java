class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int get = n/2;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])>get)
            {
                ans = nums[i];
            }
        }
        return ans;
    }
}
