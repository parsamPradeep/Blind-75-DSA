package com.blind.dynamic;

public class LongestCommonSubsequence {
	//Approach - 1
	public static int longestCommonSubsequence(String text1, String text2) {
		int arr[][] = new int[text1.length() + 1][text2.length() + 1];
		int max = 0;
		String s="";
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
					s+=String.valueOf(text1.charAt(i-1));
				} else {
					arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
				}
				if (arr[i][j] > max)
					max = arr[i][j];
			}
		}
		System.out.println(s);
		return max;

	}
	
	// Approach -2 time limit exceeds
	public static int longestCommonSubsequence2(String text1, String text2) {
        return lCS(0,0,text1,text2);
    }
    public static int lCS(int i, int j, String text1, String text2 ){
        if(i>=text1.length() || j>=text2.length())
            return 0;
        if(text1.charAt(i)==text2.charAt(j))
            return 1 + lCS(i+1, j+1, text1, text2);
        else 
            return Math.max(lCS(i+1, j, text1, text2), lCS(i,j+1,text1, text2));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcde", text2 = "ace" ;
		System.out.println(longestCommonSubsequence(text1, text2));
	}

}
