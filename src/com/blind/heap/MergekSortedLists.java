package com.blind.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergekSortedLists {

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

	public static ListNode mergeKLists(ListNode[] lists) {
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
		ListNode one = new ListNode(1, new ListNode());
		one.next = new ListNode(4, new ListNode());
		one.next.next = new ListNode(5,null);
		
		ListNode two = new ListNode(1, new ListNode());
		two.next=new ListNode(3, new ListNode());
		two.next.next= new ListNode(4,null);
		
		ListNode three = new ListNode(2, new ListNode());
		three.next=new ListNode(6, null);
		
		ListNode list[]=new ListNode[3];
		list[0]=one;
		list[1]=two;
		list[2]=three;
		
		ListNode res=mergeKLists(list);
		while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
	}

}
