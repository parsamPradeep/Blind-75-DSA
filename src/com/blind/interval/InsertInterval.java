package com.blind.interval;
//https://leetcode.com/problems/insert-interval/discuss/959756/Java-1ms-easy-line-by-line-explanation
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
	 public static int[][] insert(int[][] intervals, int[] newInterval) {
	        
	        List<int[]> result = new ArrayList<>();
	        
	        // Iterate through all slots
	        for(int[] slot : intervals)
	        {
	            
	            // if newInterval before slot insert newInterval & update slot as new interval
	            if(newInterval[1] < slot[0])
	            {
	                result.add(newInterval);
	                newInterval = slot;
	            } 
	            
	            // if slot is lesser than new Interval insert slot
	            else if(slot[1] < newInterval[0])
	            {
	                result.add(slot);
	            } 
	            
	            // if above conditions fail its an overlap since possibility of new interval existing in left & right of slot is checked
	            // update lowest of start & highest of end & not insert
	            else {
	                newInterval[0] = Math.min(newInterval[0],slot[0]);
	                newInterval[1] = Math.max(newInterval[1],slot[1]);
	            }
	        }
	        
	        // insert the last newInterval
	        result.add(newInterval);
	        
	        // convert to int[][] array
	        return result.toArray(new int[result.size()][]);
	    }
	 //Approach - 2
	 public static int[][] insert2(int[][] intervals, int[] newInterval) {
			List<int[]> res = new ArrayList<int[]>();
	        
			if (intervals.length == 0 && newInterval.length>0)
				return new int[][]{{newInterval[0], newInterval[1]}};

			int start = intervals[0][0];
			int end = intervals[0][1];
	        boolean included=false;
			for (int i[] : intervals) {
				if (i[0] <= end) {
					end = Math.max(end, i[1]);
				}   else {
					res.add(new int[] { start, end });
					start = i[0];
					end = i[1];
				}
	            if (!included && newInterval[0]<=end && !(newInterval[0]<start && newInterval[1]<start)) {
	                included=true;
					end = Math.max(newInterval[1], end);
	                start=Math.min(newInterval[0], start);
				}
			}
	       
	        res.add(new int[] { start, end });
	        if(!included){
	           res.add(new int[] { newInterval[0], newInterval[1] });
	       }
	        int temp[][]=res.toArray(new int[1][2]);
	        Arrays.sort(temp, (a, b) -> a[0] - b[0]);
	        return temp;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr={{1,3},{6,9}};
		int interval[]= {2,5};
		insert(arr,interval);
	}

}
