
//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
      
      // naive based solution
        int ans = 1;
        for(int i=0;i<n;i++)
        {
            int count =1;
            for(int j=i+1;j<n;j++)
            {
                if((arr[i]>=arr[j] && arr[i]<=dep[j]) ||(arr[j]>=arr[i] && arr[j]<=dep[i] ))
                {
                    count++;
                }
                
            }
            ans = Math.max(ans,count);
        }
        return ans;
      
      // optimized solution
        Arrays.sort(arr); 
        Arrays.sort(dep); 
  
        int plat_needed = 1, result = 1; 
        int i = 1, j = 0; 
  
        while (i < n && j < n) { 
        
            if (arr[i] <= dep[j]) { 
                plat_needed++; 
                i++; 
            } 
  
            else if (arr[i] > dep[j]) { 
                plat_needed--; 
                j++; 
            } 
  
            if (plat_needed > result) 
                result = plat_needed; 
        } 
  
        return result; 
        
    }
    
}
