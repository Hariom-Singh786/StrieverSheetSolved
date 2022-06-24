
//https://www.codingninjas.com/codestudio/problems/799354?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1

import java.util.*;
public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		int []nge = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(i<n)
            {
                if(!st.isEmpty())
                {
                     nge[i]=st.peek();
                }
                else
                {
                    nge[i]=-1;
                }
               
            }
            st.push(arr[i]);
        }
		return nge;
	}

}
