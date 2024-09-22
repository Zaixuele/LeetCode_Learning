public class Solution {

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        int max = maxProfit(prices);
        System.out.println(max);

    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int length = prices.length;
        int profit_max = 0;

        for (int i = 1; i < length; i++) {
            buy = Math.min(prices[i - 1], buy);
            if (i == length - 1 || (prices[i] > prices[i + 1] && prices[i] >buy)) {
                profit_max += Math.max(prices[i] - buy, 0);
                buy = prices[i];
            }

        }

        return Math.max(profit_max, 0);
    }
}



        // int profit_max_1 = 0;
        // for (int i = 1; i < length; i++) {
        //     buy = Math.min(prices[i - 1], buy);
        //     profit_max_1 = Math.max(profit_max, prices[i] - buy);
        // }
        // profit_max = Math.max(profit_max, profit_max_1);