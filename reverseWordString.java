//https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String ans ="";
        s= s.trim();
        for(String temp : s.split(" "))
        {
            ans = temp + " " + ans;
            ans = ans.trim();
        }
        return ans;
      
      // this way 
//        int left = 0;
//         int right = s.length()-1;
//         String temp="",res="";
//         while(left<=right)
//         {
//             char ch = s.charAt(left);
//             if(ch!=' ')
//             {
//                 temp+=ch;
//             }
//             else if(ch==' ')
//             {
//                 if(!res.equals("")) 
//                     res = temp+" "+res;
//                 else
//                     res = temp;
//                 temp="";
//             }
//             left++;
//         }
//        if(!temp.equals(""))
//        {
//            if(!res.equals(""))
//                res = temp+" "+res;
//            else
//                res = temp;
//        }
        
//         return res;
      
      // this way
     //   String result = new String();
     //    int i=0;
     //    int n =s.length();
     //    while(i<n)
     //    {
     //        while(i<n && s.charAt(i)==' ')i++;
     //        int j=i+1;
     //        while(j<n && s.charAt(j)!=' ')j++;
     //         String sub = s.substring(i,j);
     //        if(result.length() ==0)result = sub;
     //        else result =sub + " "+result;
     //        i=j+1;
     //    }
     // return result;
    }
}
