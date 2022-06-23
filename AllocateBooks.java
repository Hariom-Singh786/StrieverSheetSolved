//https://www.interviewbit.com/problems/allocate-books/

public class Solution {
    public int books(int[] A, int B) {
        if(B>A.length)
        {
            return -1;
        }
        int lo = A[0];
        int hi =0;
        for(int i=0;i<A.length;i++)
        {
            hi+=A[i];
        }
        // using binary search technique to solve this question
        int ans = -1;
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;
            if(isPossible(mid,A,B))
            {
                ans = mid;
                hi = mid-1;
            } 
            else
            {
                lo = mid+1;
            }  
        }
        return ans;
    }
    static boolean isPossible(int pages, int []A, int Student)
    {
        int countStundent=0;
        int sumOfPages=0;
        for(int i=0;i<A.length;i++)
        {
            if(sumOfPages+A[i]>pages)
            {
                countStundent++;
                sumOfPages=A[i];
                if(sumOfPages>pages)
                    return false;
            }
            else{
                sumOfPages+=A[i];
            }
        }
        if(countStundent<Student)return true;
        return false;
    }
}
