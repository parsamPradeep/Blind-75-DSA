package com.blind.dynamic;

import java.util.HashMap;

public class DeleteAndEarn {
	public static int deleteAndEarn(int[] nums) {
		        int maxNumber = 0;
		        HashMap<Integer, Integer> points = new HashMap<>();
		        
		        // Precompute how many points we gain from taking an element
		        for (int num : nums) {
		            points.put(num, points.getOrDefault(num, 0) + num);
		            maxNumber = Math.max(maxNumber, num);
		        }
		        
		        // Base cases
		        int twoBack = 0;
		        int oneBack = points.getOrDefault(1, 0);
		        System.out.println(points);
		        for (int num = 2; num <= maxNumber; num++) {
		            int temp = oneBack;
		            oneBack = Math.max(oneBack, twoBack + points.getOrDefault(num, 0));
		            twoBack = temp;
		        }
		        
		        return oneBack;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,3,3,4};
		deleteAndEarn(arr);

	}

}
