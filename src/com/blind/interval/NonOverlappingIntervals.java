package com.blind.interval;

import java.util.Arrays;

public class NonOverlappingIntervals {
	 public static int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int count=0;
		int end = intervals[0][1];
		for (int i=1;i<intervals.length;i++) {
			if (intervals[i][0] >= end) {
				end = intervals[i][1];
			}else{
                count++;
                end=Math.min(intervals[i][1], end);
            }
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2},{2,3},{3,4},{1,3}};
		System.out.println(eraseOverlapIntervals(arr));
	}

}
