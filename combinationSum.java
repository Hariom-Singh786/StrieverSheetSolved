//https://leetcode.com/problems/combination-sum/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        recfun(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    static void recfun(int i, int []arr, int target, ArrayList<Integer>ls, List<List<Integer>>ans)
    {
        if(i==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        
        // pick it
        if(arr[i]<=target)
        {
            ls.add(arr[i]);
            recfun(i,arr,target-arr[i],ls,ans);
            ls.remove(ls.size()-1);
        }
        //not pick it
        recfun(i+1,arr,target,ls,ans);
    }
}
