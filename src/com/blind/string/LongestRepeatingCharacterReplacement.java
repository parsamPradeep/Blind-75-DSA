package com.blind.string;
// https://leetcode.com/problems/longest-repeating-character-replacement/discuss/503011/Java-sliding-window-O(n)-with-detailed-explanation
public class LongestRepeatingCharacterReplacement {
	public static int characterReplacement(String s, int k) {

		int[] charCountCache = new int[26];

		int windowStartIndex = 0;
		int windowEndIndex = 0;

		int maxNumOfSameCharsInCurrentWindow = 0;

		int maxRepSubseqLen = 0;

		for (windowEndIndex = 0; windowEndIndex < s.length(); windowEndIndex++) {
			char newChar = s.charAt(windowEndIndex);

			charCountCache[newChar - 'A']++;

			maxNumOfSameCharsInCurrentWindow = Math.max(maxNumOfSameCharsInCurrentWindow,
					charCountCache[newChar - 'A']);

			int numOfOtherChars = (windowEndIndex - windowStartIndex + 1) - maxNumOfSameCharsInCurrentWindow;

			if (numOfOtherChars <= k) {

				maxRepSubseqLen = Math.max(maxRepSubseqLen, windowEndIndex - windowStartIndex + 1);
			} else {
				charCountCache[s.charAt(windowStartIndex) - 'A']--;

				windowStartIndex++;

				maxNumOfSameCharsInCurrentWindow = 0;
			}
		}

		return maxRepSubseqLen;
	}

	public static void main(String[] args) {
		System.out.println(characterReplacement("ABAB",2));
	}

}
