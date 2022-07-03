//https://leetcode.com/problems/number-of-islands/
class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if(row==0)
            return 0;
        int countIslands=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1')
                {
                    markVisited(grid,i,j,row,col);
                    countIslands+=1;
                }
            }
        }
        return countIslands;
    }
    static void markVisited(char[][]grid, int x, int y, int row, int col)
    {
        // base cases or critical cases
        if(x<0 || x>=row || y<0 || y>=col || grid[x][y]!='1')
            return;
        grid[x][y]='2';
        //down
            markVisited(grid,x+1,y,row,col);
        //right
            markVisited(grid,x,y+1,row,col);
        //top
            markVisited(grid,x-1,y,row,col);
        //left
            markVisited(grid,x,y-1,row,col);
    }
}
