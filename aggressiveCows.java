//https://www.codingninjas.com/codestudio/problems/aggressive-cows_1082559

import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static int aggressiveCows(ArrayList<Integer> stalls, int k) 
    {
        Collections.sort(stalls);
        int n = stalls.size();
        int lo=stalls.get(0);
        int hi = stalls.get(n-1)-stalls.get(0);
        while(lo<=hi)
        {
            int mid = (hi+lo)/2;
            if(possible(stalls,n,k,mid))
            {
                lo = mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        return hi;
    }
     public static boolean possible(ArrayList<Integer> stalls,int n,int c,int dis)
    {
        int ccount=1;
        int lastplaced= stalls.get(0);
        for(int i=1;i<n;i++)
        {
            if(stalls.get(i)-lastplaced>=dis)
            {
                ccount++;
                lastplaced=stalls.get(i);
            }
        }
        if(ccount>=dis)
        {
            return true;
        }
        return false;
    }
}
