import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
        //optimized solution  or two pointer approach left & right pointer
        Set<Character> s= new HashSet<>();
        int l=0; // left pointer
        int maxi = Integer.MIN_VALUE;
        for(int r=0;r<input.length();r++) // right pointer
        {
            if(s.contains(input.charAt(r)))
            {
                while(l<r && s.contains(input.charAt(r)))
                {
                    s.remove(input.charAt(l));
                    l++;
                }
            }
            s.add(input.charAt(r));
            maxi = Math.max(maxi,r-l+1);
        }
        return maxi;
    
        //naive solution
		int maxi = Integer.MIN_VALUE;
        int n = input.length();
        for(int i=0;i<n;i++)
        {
            Set<Character>s = new HashSet<>();
            for(int j=i;j<n;j++)
            {
                if(s.contains(input.charAt(j)))
                {
                    maxi = Math.max(maxi,j-i);
                    break;
                }
                s.add(input.charAt(j));
            }
        }
        return maxi;
	}
   
}
