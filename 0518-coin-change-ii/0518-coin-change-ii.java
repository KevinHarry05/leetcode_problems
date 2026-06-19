class Solution {
    public int change(int amount, int[] coins) {
        int n= coins.length;
        int[][]  dp = new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=n-1;i>=0;i--){
            for(int a=1;a<=amount;a++){
                int take=0;
                if(coins[i]<=a){
                    take=dp[i][a-coins[i]];
                }
                int skip=dp[i+1][a];
                dp[i][a]=take+skip;
            }
        }
        return dp[0][amount];
        
    }
}