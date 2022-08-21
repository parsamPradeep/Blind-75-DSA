package com.blind.interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Description
//Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), 
//determine if a person could attend all meetings.
//Input: intervals = [(0,30),(5,10),(15,20)]
//Output: false
//Explanation: 
//(0,30), (5,10) and (0,30),(15,20) will conflict
public class MeetingRooms {
	public static class Interval {
		int start, end;

		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	static class Sortbystart implements Comparator<Interval> {
		// Used for sorting in ascending order of
		// roll number
		public int compare(Interval a, Interval b) {
			return a.start - b.start;
		}
	}

	public static boolean canAttendMeetings(List<Interval> intervals) {
		// Write your code here
		if (intervals.size() == 0 || intervals == null)
			return true;
		Collections.sort(intervals, new Sortbystart());
		int end = intervals.get(0).end;
		for (int i = 1; i < intervals.size(); i++) {
			if (intervals.get(i).start < end) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval one = new Interval(0, 30);
		Interval two = new Interval(5, 10);
		Interval three = new Interval(15, 20);
		List<Interval> arr = new ArrayList<Interval>();

		arr.add(one);
		arr.add(two);
		arr.add(three);
		System.out.println(canAttendMeetings(arr));
	}

}
