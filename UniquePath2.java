class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return dfs(obstacleGrid,0,0,n,m);
    }
    public int dfs(int[][] grid,int i,int j,int n,int m){
        if(i>=n || j>=m){
            return 0;
        }
        if(grid[i][j] == 1){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int d = dfs(grid,i+1,j,n,m);
        int r = dfs(grid,i,j+1,n,m);
        dp[i][j] = r + d;
        return dp[i][j];
    }
}
