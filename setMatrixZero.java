class Solution {
    public void setZeroes(int[][] matrix) {
        
        //better appraoch
        int row=matrix.length;
        int col=matrix[0].length;
        int []dummy1= new int[row];
        int []dummy2= new int[col];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(dummy1[i]==0 || dummy2[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        
        //bruteforce appraoach
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    int row =i;
                    int col =j;
                    
                    for(int a=0;a<matrix[row].length;a++)
                    {
                        if(matrix[row][a]!=0)
                        {
                            matrix[row][a]=-1;
                        }
                    }
                    for(int b=0;b<matrix.length;b++)
                    {
                        if(matrix[b][col]!=0)
                        {
                            matrix[b][col]=-1;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<=0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
