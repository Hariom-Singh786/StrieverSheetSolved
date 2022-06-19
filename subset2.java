//https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>>anslist= new ArrayList<>();
        recfun(0,nums,new ArrayList<>(),anslist);
        return anslist;
    }
    static void recfun(int ind, int []nums, ArrayList<Integer>ds,List<List<Integer>>anslist)
    {
        anslist.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++)
        {
            if(i!=ind && nums[i]==nums[i-1])
                continue;
            ds.add(nums[i]);
            recfun(i+1,nums,ds,anslist);
            ds.remove(ds.size()-1);
        }
        
    }
}
