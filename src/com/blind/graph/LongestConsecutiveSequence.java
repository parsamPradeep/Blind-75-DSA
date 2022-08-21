package com.blind.graph;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	 public int longestConsecutive(int[] nums) {
	       Set<Integer> set=new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++)
	            set.add(nums[i]);
	        int max=0;
	        for(int i=0;i<nums.length;i++){
	            int count=1;
	            
	            int num=nums[i];
	            while(set.contains(--num)){
	                count++;
	                set.remove(num);
	            }
	            
	             num=nums[i];
	            while(set.contains(++num)){
	                count++;
	                set.remove(num);
	            }
	            
	            max=Math.max(count, max);
	        }
	            return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
		int arr1[]={100,4,200,1,3,2};
		System.out.println(ob.longestConsecutive(arr1));
		int arr2[]={0,3,7,2,5,8,4,6,0,1};
		System.out.println(ob.longestConsecutive(arr2));

	}

}
