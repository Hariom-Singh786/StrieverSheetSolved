

//https://practice.geeksforgeeks.org/problems/number-of-coins1824/1/#

class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
    
    // naive approach gives TLE
	   if(V==0)return -1;
	   ArrayList<Integer>ans = new ArrayList<>();
	   for(int i=M-1;i>=0;i--)
	   {
	       if(V>=coins[i])
	       {
	           V-=coins[i];
	           ans.add(coins[i]);
	       }
	   }
	   return ans.size();
	   base case
      
       //dp approach or best approach
        int table[] = new int[V + 1];

        table[0] = 0;
 
        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++)
        table[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < M; j++)
            if (coins[j] <= i)
            {
                int sub_res = table[i - coins[j]];
                if (sub_res != Integer.MAX_VALUE
                       && sub_res + 1 < table[i])
                       table[i] = sub_res + 1;
            }
        }
          if(table[V]==Integer.MAX_VALUE)
            return -1;
        return table[V];
	} 
}
