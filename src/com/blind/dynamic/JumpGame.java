package com.blind.dynamic;

public class JumpGame {
	public static boolean canJump(int[] nums) {
	       int farCanReach = 0;
	        for(int i=0; i<nums.length; i++){
	            if(i > farCanReach) return false;
	            farCanReach = Math.max(farCanReach, i+nums[i]);
	        }
	        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
