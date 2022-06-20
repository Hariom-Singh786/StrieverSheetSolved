//https://leetcode.com/problems/permutation-sequence/

class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList < Integer > numbers = new ArrayList < > ();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + "" + numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
        
        
       //  String s = "";
       //  ArrayList<String>res = new ArrayList<>();
       // for(int i=1;i<=n;i++)     
       // {
       //     s+=i;
       // }
       //  solve(s.toCharArray(),0,res);
       //  Collections.sort(res);
       //  return res.get(k-1);
    }
    // static void solve(char[]s, int index, ArrayList<String>res)
    // {
    //     if(index==s.length)
    //     {
    //         String str = new String(s);
    //         res.add(str);
    //         return;
    //     }
    //     for(int i=index;i<s.length;i++)
    //     {
    //         swap(s,i,index);
    //         solve(s,index+1,res);
    //         swap(s,i,index);
    //     }
    // }
    // static void swap(char[]s, int start, int end)
    // {
    //     char temp = s[start];
    //     s[start]=s[end];
    //     s[end]=temp;
    // }
}
