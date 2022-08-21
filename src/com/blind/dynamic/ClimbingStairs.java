package com.blind.dynamic;

public class ClimbingStairs {
	 public static int climbStairs(int n) {
	       int ptr1=0;
	       int ptr2=1;
	        
	       for(int i=0;i<n;i++){
	           int temp=ptr2;
	           ptr2=ptr1+ptr2;
	           ptr1=temp;
	       } 
	        return ptr2;
	    }
	 public static int climbStairs2(int n) {
	        if (n == 0) {
	            return 0;
	        }
	        if (n == 1) {
	            return 1;
	        }
	        if (n == 2) {
	            return 2;
	        }
	        return climbStairs(n - 1) + climbStairs(n - 2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(3));

	}

}
