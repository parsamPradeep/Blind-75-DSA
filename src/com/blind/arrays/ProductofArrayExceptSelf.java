package com.blind.arrays;

public class ProductofArrayExceptSelf {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 1, 0, -3, 3 };
		int res[] = productExceptSelf(arr);
		for(int i:res)
			System.out.println(i);
	}

}
