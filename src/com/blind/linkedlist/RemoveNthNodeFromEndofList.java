package com.blind.linkedlist;

import java.util.Stack;

public class RemoveNthNodeFromEndofList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null)
			return null;
		ListNode x = head;
		ListNode pre = null;
		Stack<ListNode> stack = new Stack<ListNode>();
		int i = 0;
		while (x != null) {
			stack.push(x);
			x = x.next;
		}
		while (i < n) {
			x = stack.pop();
			i++;
		}
		if (!stack.isEmpty()) {
			pre = stack.pop();
			pre.next = x.next;
		} else {
			head = x.next;
		}

		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
