package com.blind.binary;
// https://www.youtube.com/watch?v=gVUrDV4tZfY Just to know about & and | operator
public class ReverseBits {
	 public static int reverseBits(int n) {
	       int res=0;
	        for(int i=0;i<32;i++){
	            res=(res<<1) | (n&1);
	            n=n>>1;
	        }
	        return res;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseBits(43261596));
	}

}
