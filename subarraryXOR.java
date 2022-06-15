
public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
       
	//optimized approach
        HashMap<Integer,Integer>freq = new HashMap<>();
        int xor=0,count=0,n = arr.size();
        for(int i=0;i<n;i++)
        {
            xor = xor ^ arr.get(i);
            if(freq.get(xor ^ x)!=null)
            {
                count +=freq.get(xor ^ x);
            }
             if(xor == x) count++;
             if(freq.get(xor)!=null)
              {
                 freq.put(xor, freq.get(xor) + 1);
              }
              else  freq.put(xor,1);
        }
        return count;
		
		
        // naive approach
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
