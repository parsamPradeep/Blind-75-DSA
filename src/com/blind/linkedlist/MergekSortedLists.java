package com.blind.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergekSortedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < lists.length; i++) {
			ListNode temp = lists[i];
			while (temp != null) {
				list.add(temp.val);
				temp = temp.next;
			}
		}

		Collections.sort(list);
		ListNode head = new ListNode(0);
		ListNode h = head;
		for (int i = 0; i < list.size(); i++) {
			ListNode t = new ListNode(list.get(i));
			h.next = t;
			h = h.next;
		}
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
