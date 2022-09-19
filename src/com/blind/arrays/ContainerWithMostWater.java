package com.blind.arrays;

public class ContainerWithMostWater {
	
	 public int maxArea2(int[] height) {
	        int maxarea = 0;
	        for (int left = 0; left < height.length; left++) {
	            for (int right = left + 1; right < height.length; right++) {
	                int width = right - left;
	                maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
	            }
	        }
	        return maxarea;
	    }
	 
	 
	  public static int maxArea(int[] height) {
	        int l=0,r=height.length-1, maxarea=0;
	        while(l<r){
	            maxarea=Math.max(maxarea,Math.min(height[l],height[r])*(r-l));
	            if(height[l]<height[r])
	                l++;
	            else
	                r--;
	        }
	        return maxarea;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
	}

}
