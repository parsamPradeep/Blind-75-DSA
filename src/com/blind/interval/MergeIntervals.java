package com.blind.interval;

//https://leetcode.com/problems/merge-intervals/solution/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		LinkedList<int[]> merged = new LinkedList<>();
		for (int[] interval : intervals) {
			// if the list of merged intervals is empty or if the current
			// interval does not overlap with the previous, simply append it.
			if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
				merged.add(interval);
			}
			// otherwise, there is overlap, so we merge the current and previous
			// intervals.
			else {
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);
	}

	// Approach -2
	public static int[][] merge2(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		List<int[]> res = new ArrayList<int[]>();

		if (intervals == null || intervals.length == 0)
			return res.toArray(new int[0][2]);

		int start = intervals[0][0];
		int end = intervals[0][1];
		for (int i[] : intervals) {
			if (i[0] <= end) {
				end = Math.max(end, i[1]);
			} else {
				res.add(new int[] { start, end });
				start = i[0];
				end = i[1];
			}
		}

		res.add(new int[] { start, end });
		return res.toArray(new int[1][2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,3},{2,6},{8,10},{15,18}};
		System.out.println(merge2(arr));
	}

}
