//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
//buite force approach
        int n = height.length;
        int sum =0;
        for(int i=0;i<n;i++)
        {
            int j=i;
            int leftmax=0,rightmax=0;
            while(j>=0)
            {
                leftmax=Math.max(leftmax,height[j]);
                j--;
            }
            j=i;
            while(j<n)
            {
                rightmax=Math.max(rightmax,height[j]);
                j++;
            }
            sum += Math.min(leftmax,rightmax)-height[i];
        }
        return sum;
        
        //opimized solution
        int n=height.length;
		if(n==1)
		{
			return 0;
		}
		int []left= new int[n];
		int []right=new int[n];
		
		left[0]=height[0];
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1],height[i]);
		}
		right[n-1]=height[n-1];
		for(int j=n-2;j>=0;j--)
		{
			right[j]=Math.max(right[j+1],height[j]);
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			ans +=(Math.min(left[i],right[i]) - height[i]);
		}
		return ans;

    }
}
