class Solution {
    public int reversePairs(int[] nums) {
        //bruite force approach
        // int count=0;
        // int n= nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]>2*(long)nums[j])
        //             count+=1;
        //     }
        // }
        // return count;
        
        // return mergeSort(nums,0,nums.length-1);
    }
    
    int mergeSort(int []nums, int low, int high)
    {
        if(low>=high)
            return 0;
        int mid = (low+high)/2;
        int inv = mergeSort(nums,low,mid);
        inv+=mergeSort(nums,mid+1,high);
        inv+=merge(nums,low,mid,high);
        return inv;
    }
    int merge(int []nums, int low, int mid, int high)
    {
        int cnt =0;
        int j = mid+1;
        for(int i=low;i<=mid;i++)
        {
           while(j<=high && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            cnt+=(j-(mid+1));
        }
        
        // now we are sorting our nums[] array
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low,right=mid+1;
        while(left<=mid && right <=high)
        {
            if(nums[left]<=nums[right])
            {
                temp.add(nums[left++]);
            }
            else
            {
                temp.add(nums[right++]);
            }
        }
        while(left<=mid)
        {
            temp.add(nums[left++]);
        }
        while(right<=high)
        {
            temp.add(nums[right++]);
        }
        
        // restoring temp list to my nums array
        for(int i=low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }
        return cnt;
    }
}
