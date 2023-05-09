package Easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // My Solution

        // I set minimum price to the very first element in the array
        // Then I check if the following elements are smaller and then just set profit based on the minimum found using another condition check
    }

    public static int maxProfit(int[] prices) {

        int minimum = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            //Need to find min
            if(prices[i] < minimum) {
                minimum = prices[i];
            }
            //Find max profit
            if(prices[i] - minimum > profit) {
                profit = prices[i] - minimum;
            }
        }

        return profit;

    }
}

