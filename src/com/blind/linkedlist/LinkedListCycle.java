package com.blind.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	static Node head;

	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static boolean hasCycle(Node head) {
		Node walker = head;
		Node runner = head;
		while (runner.next != null && runner.next.next != null) {
			walker = runner.next;
			runner = runner.next.next;
			if (walker == runner)
				return true;
		}
		return false;
	}
	
	// Approach - 2
	Set<Node> set=new HashSet<>();
    public boolean hasCycle2(Node head) {
        Node temp=head;
        while(temp!=null){
            if(!set.contains(temp))
                set.add(temp);
            else
                return true;
            temp=temp.next;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
