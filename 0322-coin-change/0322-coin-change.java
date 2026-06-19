class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        dp[n][0] = 0;

        for (int j = 1; j <= amount; j++) {
            dp[n][j] = Integer.MAX_VALUE;
        }

        for (int i = n - 1; i >= 0; i--) {

            dp[i][0] = 0;

            for (int j = 1; j <= amount; j++) {

                int skip = dp[i + 1][j];

                int take = Integer.MAX_VALUE;

                if (coins[i] <= j &&
                    dp[i][j - coins[i]] != Integer.MAX_VALUE) {

                    take = 1 + dp[i][j - coins[i]];
                }

                dp[i][j] = Math.min(take, skip);
            }
        }

        return dp[0][amount] == Integer.MAX_VALUE
                ? -1
                : dp[0][amount];
    }
}