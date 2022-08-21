package com.blind.dynamic;
//https://www.youtube.com/watch?v=cQX3yHS0cLo&t=65s
public class DecodeWays {
	public static int numDecodings(String s) {

		if (s.charAt(0) == '0')
			return 0;
		if (s.length() == 1)
			return 1;

		int n = s.length();
		int dp[] = new int[n + 1];

		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;

		for (int i = 2; i <= n; i++) {
			int digitOne = Integer.valueOf(s.substring(i - 1, i));
			int digitTwo = Integer.valueOf(s.substring(i - 2, i));
			if (digitOne >= 1) {
				dp[i] += dp[i - 1];
			}
			if (digitTwo >= 10 && digitTwo <= 26) {
				dp[i] += dp[i - 2];
			}

		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(numDecodings("1201234"));
	}

}
