package com.blind.dynamic;

// https://www.youtube.com/watch?v=xlvhyfcoQa4&t=7s for approach-2
public class HouseRobber {
	public static int rob1(int[] nums) {
		int res1 = 0;
		int res2 = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = res1;
			res1 = Math.max(nums[i] + res2, res1);
			res2 = temp;
		}
		return res1;

	}

	public static int rob2(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		int dp[] = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
		}
		return dp[nums.length - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1};
		System.out.println(rob2(arr));
	}

}
