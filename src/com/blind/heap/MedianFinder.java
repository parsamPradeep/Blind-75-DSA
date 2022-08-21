package com.blind.heap;

import java.util.Collections;
import java.util.PriorityQueue;
// https://www.youtube.com/watch?v=itmhHWaHupI
public class MedianFinder {
	private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
	private PriorityQueue<Integer> large = new PriorityQueue<>();

	private PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
	private PriorityQueue<Integer> min = new PriorityQueue<>();

	public void addNum(int num) {
		small.offer(num);
		large.offer(small.poll());
		if (small.size() < large.size()) {
			small.offer(large.poll());
		}
	}

	public void addNum2(int num) {
		min.offer(num);
		max.offer(min.poll());
		if (min.size() < max.size()) {
			min.offer(max.poll());
		}
	}

	public double findMedian() {
		if (small.size() == large.size())
			return (large.peek() + small.peek()) / 2.0;
		else
			return small.peek();
	}

	public double findMedian2() {
		if (min.size() == max.size())
			return (max.peek() + min.peek()) / 2.0;
		else
			return min.peek();
	}

	public static void mail(String args[]) {
		// TODO Auto-generated method stub
		MedianFinder m = new MedianFinder();
		m.addNum(2);
		m.addNum(3);
		System.out.println(m.findMedian());
		m.addNum(5);
		m.addNum(1);
		System.out.println(m.findMedian());

	}

}
