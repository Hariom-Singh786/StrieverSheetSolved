
/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo =0;
        int n =matrix.length;
        int m = matrix[0].length;
        int hi = (n*m)-1;
        if(n==0)return false;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }
            if(matrix[mid/m][mid%m]<target)
            {
                lo = mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        return false;
    }
}
