package com.blind.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hp=new HashMap<Integer, Integer>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hp.containsKey(complement)){
                res[0]=hp.get(complement);
                res[1]=i;
                return res;
            }
            hp.put(nums[i],i);
            
        }
		return res;
	}
        
	public static void main(String[] args) {
		int num[]= {2,7,11,15};
		int target=9;
		int res[]=twoSum(num, target);

	}

}
