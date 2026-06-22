class Solution {
     public int solve( int i , int j ,int[][] grid, Integer[][] dp){
        int m = grid.length;
        int n = grid[0].length;
            if(i>=m || j>=n){
                return 0;
            }
            if(grid[i][j]==1){
                return 0;
            }
            if(i==m-1 && j==n-1){
                return 1;
            }
            
            if(dp[i][j]!=null){
                return dp[i][j];
            }
            dp[i][j]= solve(i+1,j,grid,dp) + solve(i,j+1,grid,dp);
            return dp[i][j];
        }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        Integer[][] dp= new Integer[m][n];
        return solve(0,0,obstacleGrid,dp);
        
    }
}