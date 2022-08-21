package com.blind.binary;

public class SumofTwoIntegers {
	 public static int getSum(int a, int b) {
	        while(b!=0){
	            int temp=(a&b)<<1;
	            a=(a^b);
	            b=temp;
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(9, 11));
	}

}
