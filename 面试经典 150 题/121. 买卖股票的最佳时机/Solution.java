public class Solution {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int max = maxProfit(prices);
        System.out.println(max);

    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int num = prices.length;
        int profit_max = 0;

        for (int i = 1; i < num; i++) {
            buy = Math.min(prices[i - 1], buy);
            profit_max = Math.max(profit_max, prices[i] - buy);
        }
        return profit_max;
    }
}