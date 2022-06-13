//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#

class GfG
{
    int maxLen(int arr[], int n)
    {
      
      //optimized solution
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0,maxi=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
                maxi = i+1;
            }
            else
            {
                if(map.get(sum)!=null)
                {
                    maxi= Math.max(maxi,i-map.get(sum));
                }
                else
                {
                    map.put(sum,i);
                }
            }
        }
        return maxi;
      
      //bruite force approach
        // int max = 0;
        // for(int i=0;i<n;i++)
        // {
        //     int sum =0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum+=arr[j];
        //         if(sum==0)
        //         {
        //             max = Math.max(max,j-i+1);
        //         }
        //     }
        // }
        // return max;
    }
}
