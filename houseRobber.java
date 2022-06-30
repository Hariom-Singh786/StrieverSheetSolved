

public class Solution {
	public static long houseRobber(int[] valueInHouse) {
		int n = valueInHouse.length;
        int []arr1= new int[n];
        int []arr2= new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            if(i!=0)arr1[j++]=valueInHouse[i];
            if(i!=n-1)arr2[k++]=valueInHouse[i];
        }
        long ans1 = solve(arr1);
        long ans2= solve(arr2);
        return Math.max(ans1,ans2);
	}
    static long solve(int []arr)
    {
        int n = arr.length;
        long prev1=arr[0];
        long prev2=0;
        for(int i=1;i<n;i++)
        {
            long pick = arr[i];
            if(i>1)
            {
                pick+=prev2;
            }
            long not = 0 + prev1;
            long curr= Math.max(pick,not);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
