//https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int len = 0;
        String newString = "";
        
        for(int g = 0; g < s.length(); g++){
            for(int i = 0, j = g; j < s.length(); i++, j++){
                
                if(g == 0){
                    dp[i][j] = true;
                }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                       
                    }else{
                        dp[i][j] = false;
                    }
                }
                
                if(dp[i][j]){
                    len = g + 1;
                    newString = s.substring(i, j+1);
                }
            }
        }
        
        return newString;
        
        // String ans= new String();
        // int maxLen= Integer.MIN_VALUE;
        // for(int i=0;i<s.length();i++)
        // {
        //    for(int j=i+1;j<s.length();j++)
        //    {
        //        String temp = s.substring(i,j);
        //        if(isPalindrome(temp))
        //        {
        //            int l = temp.length();
        //            maxLen= Math.max(l,maxLen);
        //            if(maxLen>=l)
        //            {
        //                ans=temp;
        //            }
        //        }
        //    }
        // }
        // return ans;
    }
    // static boolean isPalindrome(String s)
    // {
    //     int left = 0;
    //     int right = s.length()-1;
    //     while(left<=right)
    //     {
    //         if(s.charAt(left)!=s.charAt(right))
    //         {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
}
