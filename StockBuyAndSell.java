class Solution {
    public int maxProfit(int[] prices) {
        
        //naive approach or bruite force approach
        // int maxi= 0;
        // int n = prices.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(prices[i]<prices[j])
        //         {
        //             maxi = Math.max(maxi, prices[j]-prices[i]);
        //         }
        //     }
        // }
        // return maxi;

        //optimal solution
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++)
        {
            minPrice= Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}
