package com.blind.tree;

import java.util.ArrayList;

public class KthSmallestElementinaBST {
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

	public static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
		if (root == null)
			return arr;
		inorder(root.left, arr);
		arr.add(root.val);
		inorder(root.right, arr);
		return arr;
	}

	public static int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
		return nums.get(k - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
