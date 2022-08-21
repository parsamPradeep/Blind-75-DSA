package com.blind.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public void reorderList(ListNode head) {
		List<ListNode> list = new ArrayList<ListNode>();
		ListNode node = head;
		while (node != null) {
			list.add(node);
			node = node.next;
		}

		node = head;
		int j = list.size() - 1;
		for (int i = 0; i <= list.size() / 2; i++) {
			if (i == (list.size() / 2) || j == (list.size() / 2)) {
				list.get(j).next = list.get(i).next;
				list.get(i).next = list.get(j);
				list.get(j).next = null;
				break;
			} else {
				list.get(j).next = list.get(i).next;
				list.get(i).next = list.get(j);
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
