package com.blind.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
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

	// Approach - 1
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			List<Integer> iList = new ArrayList<Integer>();
			int size = queue.size();
			while (size-- > 0) {
				TreeNode node = queue.poll();
				iList.add(node.val);
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			list.add(iList);
		}
		return list;
	}

	// Approach - 2 pre-order
	public static List<List<Integer>> levelOrder2(TreeNode root) {
		List<List<Integer>> output = new ArrayList<>();
		levelOrderHelper(output, root, 0);
		return output;
	}

	public static void levelOrderHelper(List<List<Integer>> output, TreeNode root, int level) {
		if (root == null) {
			return;
		} else {
			if (level >= output.size()) {
				output.add(new ArrayList<>());
			}
			output.get(level).add(root.val);
			levelOrderHelper(output, root.left, level + 1);
			levelOrderHelper(output, root.right, level + 1);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.val = 5;
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);
		System.out.println(levelOrder(root));

	}

}
