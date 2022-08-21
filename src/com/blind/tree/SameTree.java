package com.blind.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class SameTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	// Approach - 1 recursion
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null && q != null || p != null && q == null)
			return false;
		if (p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	// Approach - 2 DFS
	public static boolean isSameTree2(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if ((p == null && q != null) || (p != null && q == null)) {
			return false;
		}
		Stack<TreeNode> node1 = new Stack<>();
		Stack<TreeNode> node2 = new Stack<>();
		node1.push(p);
		node2.push(q);
		while (!node1.isEmpty() && !node2.isEmpty()) {
			TreeNode i = node1.pop();
			TreeNode j = node2.pop();
			if (i == null || j == null)
				return false;
			if (i.val != j.val)
				return false;
			if (i.left != null && j.left == null || i.left == null && j.left != null)
				return false;
			if (i.left != null) {
				node1.push(i.left);
				node2.push(j.left);
			}
			if (j.right != null) {
				node1.push(i.right);
				node2.push(j.right);
			}
		}
		return true;
	}

	// Approach - 3 BFS
	public boolean isSameTree3(TreeNode p, TreeNode q) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(p);
		queue.add(q);
		while (!queue.isEmpty()) {
			TreeNode f = queue.poll();
			TreeNode s = queue.poll();
			if (f == null && s == null) {
				continue;
			} else if (f == null || s == null || f.val != s.val) {
				return false;
			}
			queue.add(f.left);
			queue.add(s.left);
			queue.add(f.right);
			queue.add(s.right);
		}
		return true;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.val = 5;
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);
		TreeNode root2 = new TreeNode();
		root2.val = 5;
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(4);
		System.out.println(isSameTree2(root, root2));

	}

}
