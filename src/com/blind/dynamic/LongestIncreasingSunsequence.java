package com.blind.dynamic;
//https://www.youtube.com/watch?v=CE2b_-XfVDk
//https://www.youtube.com/watch?v=fV-TF4OvZpk&t=1s
public class LongestIncreasingSunsequence {
	 public static int lengthOfLIS(int[] nums) {
	        int res=1;
	        int temp [] = new int[nums.length];
	         for(int i=0;i<temp.length;i++){
	             temp[i]=1;
	         }
	        for(int i=1;i<nums.length;i++){
	            for(int j=0;j<i;j++){
	                if(nums[i]>nums[j] && temp[i]<=temp[j]+1){
	                   temp[i]=temp[j]+1;
	                    res=Math.max(res,temp[i]);
	                } 
	            }
	        }
	        
	        return res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
