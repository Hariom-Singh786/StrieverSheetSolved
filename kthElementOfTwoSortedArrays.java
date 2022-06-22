
//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1#

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
            if(k == n+m){
           return Math.max(arr2[m-1], arr1[n-1]);
       }
       int i = 0, j = 0;
       while(--k>0){
           /*  7 2 8
               72 86 113 119 265 445 892
               100 112
           test case */
           if(i<n && j<m){  
               if(arr1[i]<arr2[j]){
                   i++;
               }
               else{
                   j++;
               }
           }
          else{
           if(i<n)
               i++;
           else
               j++;
       }
           
       }
       if(i<n && j<m)
           return Math.min(arr1[i], arr2[j]);
       else{
           if(i<n)
               return arr1[i];
           else
               return arr2[j];
       }
       
 // another approach
        int i=0,j=0,count=0;
        long ans=0;
        while(i<n && j<m)
        {
            if(count==k)break;
            else if(arr1[i]<arr2[j])
            {
                ans=arr1[i];
                ++i;
            }
            else
            {
                ans = arr2[j];
                ++j;
            }
            ++count;
        }
        if(count!=k)
        {
            if(i!=n-1)
            {
                ans = arr1[k-count];
            }
            else
            {
                ans = arr2[k-count];
            }
        }
        return ans;
    }
}
