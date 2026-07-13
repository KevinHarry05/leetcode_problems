import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];
        if (cost <= money) {
            return money - cost;
        }
        return money;
    }
}