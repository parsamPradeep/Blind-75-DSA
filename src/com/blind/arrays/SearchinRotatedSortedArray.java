package com.blind.arrays;

public class SearchinRotatedSortedArray {
	 public static int search(int[] nums, int target) {
	        int n=nums.length/2;
	        int j=nums.length-1;
	        if(nums.length==1 && nums[0]==target)
	            return 0;
	        for(int i=0;i<=n;i++){
	            if(nums[i]==target)
	                return i;
	            else if(nums[j]==target)
	                return j;
	            j--;
	        }
	        return -1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2};
		System.out.println(search(arr, 0));
	}

}
