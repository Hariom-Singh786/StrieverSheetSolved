//https://leetcode.com/problems/palindrome-partitioning/

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res = new ArrayList<>();
        List<String>sub = new ArrayList<>();
        recfun(0,s,sub,res);
        return res;
    }
    static void recfun(int index, String s, List<String>sub, List<List<String>>res)
    {
        // base case
        if(index == s.length())
        {
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(s,index,i))
            {
                sub.add(s.substring(index,i+1));
                recfun(i+1,s,sub,res);
                sub.remove(sub.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s, int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}
