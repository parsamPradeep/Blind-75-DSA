package com.blind.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDeserializeBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public String serialize(TreeNode root) {
		if (root == null)
			return "";
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		StringBuilder s = new StringBuilder();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.poll();
			if (root == null) {
				s.append("n ");
				continue;
			}
			s.append(root.val + " ");
			q.add(root.left);
			q.add(root.right);

		}
		return s.toString();
	}

	public TreeNode deserialize(String data) {
		if (data == "")
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		String s[] = data.split(" ");
		TreeNode root = new TreeNode(Integer.parseInt(s[0]));
		q.add(root);
		for (int i = 1; i < s.length; i++) {
			TreeNode parent = q.poll();
			if (!s[i].equals("n")) {
				TreeNode left = new TreeNode(Integer.parseInt(s[i]));
				parent.left = left;
				q.add(left);
			}
			if (!s[++i].equals("n")) {
				TreeNode right = new TreeNode(Integer.parseInt(s[i]));
				parent.right = right;
				q.add(right);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
