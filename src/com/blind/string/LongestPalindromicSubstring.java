package com.blind.string;

public class LongestPalindromicSubstring {
	static int resultStart;
	static int resultLength;

	public static String longestPalindrome(String s) {

		for (int start = 0; start < s.length(); start++) {
			expandRange(s, start, start);
			expandRange(s, start, start + 1);
		}
		return s.substring(resultStart, resultStart + resultLength);
	}

	public static void expandRange(String str, int begin, int end) {
		while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		if (resultLength < end - begin - 1) {
			resultStart = begin + 1;
			resultLength = end - begin - 1;
		}
	}

	public static void main(String[] args) {
		String s="abcabcbb";
		System.out.println(longestPalindrome(s));

	}

}
