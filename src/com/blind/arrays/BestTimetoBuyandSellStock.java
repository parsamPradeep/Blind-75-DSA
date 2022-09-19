package com.blind.arrays;

public class BestTimetoBuyandSellStock {
	
	public int maxProfit2(int prices[]) {
		int maxprofit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];
				if (profit > maxprofit)
					maxprofit = profit;
			}
		}
		return maxprofit;
	}

	public static int maxProfit(int[] prices) {
		int minValue = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minValue)
				minValue = prices[i];
			else if (prices[i] - minValue > maxProfit) {
				maxProfit = prices[i] - minValue;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(arr));

	}

}
