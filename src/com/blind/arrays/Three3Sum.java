package com.blind.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three3Sum {
	public static List<List<Integer>> threeSum1(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						list.add(Arrays.asList(nums[lo], nums[hi], nums[i]));
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (nums[hi] + nums[lo] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return list;
	}

	// https://www.youtube.com/watch?v=jzZsG8n2R9A&t=537s
	public static List<List<Integer>> threeSum2(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		if (nums.length == 0)
			return new ArrayList<>(set);
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1; // j starts at i+1
			int k = nums.length - 1; // k starts at the end
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0)
					set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				else if (sum > 0)
					k--;
				else if (sum < 0)
					j++;
			}
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,0,1,2,-1,-4};
		List<List<Integer>> res=threeSum1(arr);
		System.out.println(res);
	}

}
