
//https://leetcode.com/problems/longest-consecutive-sequence/

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if(N==0)return 0;  
        Arrays.sort(arr);
        int cnt=1;
        int prev= arr[0];
        int curr=1;
        for(int i=1;i<N;i++)
        {
            if(arr[i]==prev+1)
            {
                curr++;
            }
            else if(prev != arr[i])
            {
                curr=1;
            }
            prev = arr[i];
            cnt = Math.max(curr,cnt);
        }
        return cnt;
    }
}
