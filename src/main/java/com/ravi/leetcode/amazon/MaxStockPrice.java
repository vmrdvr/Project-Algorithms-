package com.ravi.leetcode.amazon;

public class MaxStockPrice {

	public static int maxProfit(int[] prices) {
		if (prices.length == 0 || prices.length == 1)
			return 0;
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {

			if (prices[i] < minprice) {
				minprice = prices[i];
			} else if (prices[i] - minprice > maxprofit) {
				maxprofit = prices[i] - minprice;
			}

		}
		return maxprofit;

	}

	public static void main(String[] args) {

		int[] prices = { 2, 1, 8, 4, 1 };

		System.out.println(maxProfit(prices));
	}
}
