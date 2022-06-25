//https://www.interviewbit.com/problems/nearest-smaller-element/

public class Solution {
    public int[] prevSmaller(int[] A) {
      int n = A.length;
      int []ans = new int[n];
      Stack<Integer>st = new Stack<>();
      for(int i=0;i<n;i++)
      {
        int a = -1;
        while(!st.isEmpty() && st.peek() >= A[i])
        {
          st.pop();
        }
        if(!st.isEmpty())
        {
         a= st.peek(); 
        }
        ans[i]=a;
        st.push(A[i]);
      }
      return ans;
    }
}
