class Solution {
    public int findMin(int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        int[] coins = {1,2,5,10};
        for(int i=1; i<=n; i++){
            for(int coin : coins){
                if(i>=coin){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[n];
    }
}
