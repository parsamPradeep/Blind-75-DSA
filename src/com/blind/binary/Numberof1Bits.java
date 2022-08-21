package com.blind.binary;

public class Numberof1Bits {
	 public static int hammingWeight(int n) {
	        String str=Integer.toBinaryString(n);
	        int res=0;
	        for(int l=0;l<str.length();l++){
	            if(str.charAt(l)=='1')
	                res++;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(3));
	}

}
