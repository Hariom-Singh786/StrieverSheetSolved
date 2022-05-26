
class Solution {
    public double myPow(double x, int n) {
      double ans =1.0;
        long m = n;
        if(m<0)
            m = -1*m;
        while(m>0)
        {
            //if power is odd
            if(m%2==1)
            {
                ans = ans * x;
                m = m-1;
            }
            //if power is even
            else
            {
                x = x * x;
                m = m/2;
            }
        }
        if(n<0)
            ans = (double)(1.0)/(double)(ans);
        return ans;
    }
}

// brute force approach
/*
   public double myPow(double x, int n) {
        double ans =1;
        long m =n;
        if(m<0)
        {
            m = -1*m;
        }
        for(int i=0;i<m;i++)
        {
            ans = ans*x;
        }
        if(n<0)
        {
            return (double)(1/ans);
        }
        return ans;
    }
    
*/
