package com.blind.string;

public class PalindromicSubstrings {
		static int count=0;
	    public static int countSubstrings(String s) {
	       for (int start = 0; start < s.length(); start++) {
				expandRange(s, start, start);
				expandRange(s, start, start + 1);
			}
	        return count;
	    }
	    public static void expandRange(String str, int begin, int end) {
			while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
	            count++;
				begin--;
				end++;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSubstrings("abc"));
	}

}
