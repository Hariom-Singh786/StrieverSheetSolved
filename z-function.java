
//https://leetcode.com/problems/implement-strstr/
class Solution {
    public int strStr(String haystack, String needle) {
        // quick solution
//         if(needle.length()==0)return 0;
//         if(haystack.length()<needle.length())return -1;
//         return haystack.indexOf(needle);
        
        if(needle.length()==0)return 0;
        if(haystack.length()<needle.length())return -1;
        int index=0;
        StringBuilder sb = new StringBuilder(haystack);
        while(true)
        {
            if(sb.substring(index,needle.length()+index).equals(needle))
            {
                return index;
            }
            index++;
            if(index+needle.length()>sb.length())
            {
                return -1;
            }
        }
      
    }
}
