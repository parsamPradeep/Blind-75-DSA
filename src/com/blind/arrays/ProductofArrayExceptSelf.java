package com.blind.arrays;
// https://leetcode.com/problems/product-of-array-except-self/discuss/1342916/3-Minute-Read-Mimicking-an-Interview
public class ProductofArrayExceptSelf {
	// Effecient
	public static int[] productExceptSelf(int[] nums) {
		int res[] = new int[nums.length];
		for (int i = 0, temp = 1; i < nums.length; i++) {
			res[i] = temp;
			temp *= nums[i];
		}
		for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
			res[i] *= temp;
			temp *= nums[i];
		}

		return res;
	}
	
	 public int[] productExceptSelf2(int[] nums) {
	        int n = nums.length;
	        int ans[] = new int[n];
	        
	        for(int i = 0; i < n; i++) {
	            int pro = 1;
	            for(int j = 0; j < n; j++) {
	                if(i == j) continue;
	                pro *= nums[j];
	            }
	            ans[i] = pro;
	        }
	        
	        return ans;
	    }
	 public int[] productExceptSelf3(int[] nums) {
	        int n = nums.length;
	        int ans[] = new int[n];
	        int pro = 1;
	        for(int i : nums) {
	            pro *= i;
	        }
	        
	        for(int i = 0; i < n; i++) {
	            ans[i] = pro / nums[i];
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 1, 0, -3, 3 };
		int res[] = productExceptSelf(arr);
		for(int i:res)
			System.out.println(i);
	}

}
