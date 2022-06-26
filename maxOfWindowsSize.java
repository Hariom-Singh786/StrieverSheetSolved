

public class Solution {
    public static int[] maxMinWindow(int[] a, int n) {
      
      //TLE solution or naive solution
        int []ans = new int[n];
        for(int k=1;k<=n;k++)
        {
            int maxOfMin=Integer.MIN_VALUE;
            for(int i=0;i<=n-k;i++)
            {
                int min=a[i];
                for(int j=1;j<k;j++)
                {
                    if(min>a[i+j])
                    {
                        min=a[i+j];
                    }
                }
                if(min>maxOfMin)
                {
                    maxOfMin=min;
                   
                }
            }
             ans[k-1]=maxOfMin;
        }
        return ans;
    }
}

