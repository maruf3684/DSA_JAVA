package DsXXAlgo.Array.Mid;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 1,5,3,6,4};
        int minPrice = prices[0];
        int profit = 0; //same day te kine same day te bachle
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit,prices[i]-minPrice);
            minPrice = Math.min(minPrice,prices[i]);
        }
        System.out.println(profit);
    }
}
