package com.blind.dynamic;

import java.util.Arrays;

public class CoinChange {
	
//https://www.youtube.com/watch?v=Y0ZqKpToTic&t=5s
	public static int coinChange(int[] coins, int amount) {
		int dp[] = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int j = 0; j < coins.length; j++) {
			for (int i = 1; i <= amount; i++) {
				if (i >= coins[j]) {
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
	
	
	public static int coinChange2(int[] coins, int amount) {
		int dp[] = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int i = 0; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
