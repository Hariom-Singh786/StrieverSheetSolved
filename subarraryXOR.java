
public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int count=0;
        int n = arr.size();
        for(int i=0;i<n;i++)
        {
            int curr_xor = 0;
            for(int j=i;j<n;j++)
            {
                curr_xor ^= arr.get(j);
                if(curr_xor == x)
                {
                    count++;
                }
            }
        }
        return count;
	}
}
