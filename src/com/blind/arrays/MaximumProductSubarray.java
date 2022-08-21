package com.blind.arrays;

public class MaximumProductSubarray {
	//https://leetcode.com/problems/maximum-product-subarray/discuss/1608862/JAVA-or-3-Solutions-or-Detailed-Explanation-Using-Image
	 public static int  maxProduct1(int[] nums) {
	        int l=1;
	        int r=1;
	        int ans=nums[0];
	        int n=nums.length;
	        for(int i=0;i<n;i++){
	            
	            l=l==0?1:l;
	            r=r==0?1:r;
	            
	            l*=nums[i];
	            r*=nums[n-i-1];
	            
	            ans=Math.max(Math.max(l,r), ans);
	        }
	        return ans;
	    }
	 public static int maxProduct2(int[] nums) {
	        int res=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            int temp=1;
	            for(int j=i;j<nums.length;j++){
	                temp*=nums[j];
	                res=Math.max(res,temp);
	            }
	        }
	        return res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8};
		System.out.println(maxProduct2(arr));
	}

}
