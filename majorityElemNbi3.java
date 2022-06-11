class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ls = new ArrayList<>();
        HashMap<Integer, Integer>map= new HashMap<>();
        int n = nums.length;
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
        for(int it:map.keySet())
        {
            if(map.get(it)>n/3)
                ls.add(it);
        }
        return ls;
    }
}
