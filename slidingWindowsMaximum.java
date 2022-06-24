//https://leetcode.com/problems/sliding-window-maximum/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        //naive approach
        int []ans= new int[nums.length-k+1];
        int max;
        for(int i=0;i<=nums.length-k;i++)
        {
            max=nums[i];
            for(int j=1;j<k;j++)
            {
                if(nums[i+j]>max)
                {
                    max=nums[i+j];
                }
            }
            ans[i]=max;
        }
        return ans;
    
        // sliding windows solution
        int n = nums.length;
        int []res = new int[n-k+1];
        int p=0;
        Deque<Integer>q = new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(!q.isEmpty() && q.peek()==i-k)
            {
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1)
            {
                res[p++]=nums[q.peek()];
            }
        }
        return res;
    }
}
