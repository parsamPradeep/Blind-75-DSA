package com.blind.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
	public static class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	public static Node reverseList(Node head) {
        if(head == null)
            return null;
        Node root=head.next;
        Node ptr=head;
        while(root!=null){
            ptr.next=root.next;
            root.next=head;
            head=root;
            root=ptr.next;
        }
        return head;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next = new Node(3);
		head.next.next.next=new Node(4);
		Node root=reverseList(head);
		while(root !=null) {
			System.out.println(root.val);
			root=root.next;
		}
		}

}
