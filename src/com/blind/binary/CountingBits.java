package com.blind.binary;
// https://leetcode.com/problems/counting-bits/discuss/79557/How-we-handle-this-question-on-interview-Thinking-process-%2B-DP-solution
public class CountingBits {
	public static int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String str=Integer.toBinaryString(i);
            int temp=0;
            for(int j=0;j<str.length();j++)
                if(str.charAt(j)=='1')
                    temp++;
            res[i]=temp;
        }
        return res;
    }
	//Approach - 2
	public static int[] countBits2(int num) {
	    int result[] = new int[num + 1];
	    int offset = 1;
	    for (int index = 1; index <= num; ++index){
	        if (offset * 2 == index){
	            offset *= 2;
	        }
	        result[index] = result[index - offset] + 1;
	    }
	    return result;
	}
	
	// Approach - 3
	public int[] countBits3(int num) {

        if(num == 0) return new int[1];
        
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < num + 1; i++){
            if(i % 2 == 0)
                dp[i] = dp[i/2];
            else
                dp[i] = dp[i/2] + 1;
        }

        return dp;
    }
	public static void main(String[] args) {
		System.out.println(countBits2(5));

	}

}
