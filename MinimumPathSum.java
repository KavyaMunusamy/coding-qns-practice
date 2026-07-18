class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] dp = new int[m];
        dp[m-1] = grid[n-1][m-1];
        for(int j=m-2; j>=0; j--){
            dp[j] = grid[n-1][j] + dp[j+1];
        }
        for(int i=n-2; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(j==m-1){
                    dp[j] = grid[i][j] + dp[j];
                }else{
                    dp[j] = grid[i][j] + Math.min(dp[j],dp[j+1]);
                }
            }
        }
        return dp[0];
    }
}
