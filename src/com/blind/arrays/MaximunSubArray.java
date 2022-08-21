package com.blind.arrays;

public class MaximunSubArray {
	//Kadane's Algorithm 
	 public static int maxSubArray(int[] nums) {
	        int res=Integer.MIN_VALUE;
	        int sum=0;
	        for(int i=0;i<nums.length;i++){
	           sum+=nums[i];
	            res=Math.max(sum,res);
	            if(sum<0)
	                sum=0;
	        }
	        return res;
	    }
	 
	 public int maxSubArray2(int[] nums) {
	        int res=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            int temp=0;
	            for(int j=i;j<nums.length;j++){
	                temp+=nums[j];
	                res=Math.max(res,temp);
	            }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
