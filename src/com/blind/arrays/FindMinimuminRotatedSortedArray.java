package com.blind.arrays;

public class FindMinimuminRotatedSortedArray {
	 public static int findMin1(int[] nums) {
	        if(nums.length==1)
	            return nums[0];
	        int min=Integer.MAX_VALUE;
	        int j=nums.length-1;
	        for(int i=0;i<=nums.length/2;i++){
	            if(nums[i]<min)
	                min=nums[i];
	            if(nums[j]<min)
	                min=nums[j];
	            j--;
	        }
	        return min;
	    }
	 public static int findMin(int[] nums) {
	        int res=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<res){
	                res=nums[i];
	            }
	        }
	        return res;
	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,1,2};
		System.out.println(findMin(arr));
	}

}
