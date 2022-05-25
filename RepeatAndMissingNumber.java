public class Solution {
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        int []ans = new int[2];
        int []freq= new int[n+1];
        for(int i=0;i<n;i++)
        {
                freq[A[i]]+=1;
        }
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==0)
            {
                ans[1]=i;
            }
            else if(freq[i]==2)
            {
                ans[0]=i;
            }
        }
        return ans;
    }
}
