package com.blind.binary;

public class MissingNumber {
	// Sum of n number formula
	 public static int missingNumber(int[] nums) {
	      int len=nums.length;
			 int sum=len*(len+1)/2;
			 for(int i=0;i<nums.length;i++)
				 sum-=nums[i];
			 return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(arr));
	}

}
