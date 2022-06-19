

//https://practice.geeksforgeeks.org/problems/subset-sums2234/1#
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> subset = new ArrayList<>();
        fun(0,0,arr,N,subset);
        Collections.sort(subset);
        return subset;
    }
    void  fun(int i, int sum, ArrayList<Integer>arr, int N,ArrayList<Integer>subset )
    {
        // base case
        if(i == N)
        {
            subset.add(sum);
            return;
        }
        //taken it
        fun(i+1,sum+arr.get(i),arr,N,subset);
        //not take it
        fun(i+1,sum,arr,N,subset);
    }
}
