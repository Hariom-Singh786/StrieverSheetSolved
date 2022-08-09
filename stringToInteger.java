//https://leetcode.com/problems/string-to-integer-atoi/submissions/
class Solution {
    public int myAtoi(String s) {
        int res =0,i=0;
        boolean isneg = false;
        boolean ispos=false;
        // white space
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        //check negative
        if(i<s.length() && s.charAt(i)=='-')
        {
            isneg=true;
            i++;
        }
        //check positive
        if(i<s.length() && s.charAt(i)=='+')
        {   
            ispos=true;
            i++;
        }
        if(ispos && isneg)
        {
            return 0;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int curr= s.charAt(i)-'0';
            if((Integer.MAX_VALUE - curr)/10 < res)
            {
                if(isneg)
                {
                    return Integer.MIN_VALUE;
                }
                else
                {
                    return Integer.MAX_VALUE;
                }
            }
            res = res*10+curr;
            i++;
        }
        return isneg?(-1*res):res;
    }
}  
