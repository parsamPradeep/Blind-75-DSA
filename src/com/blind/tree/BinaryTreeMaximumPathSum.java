package com.blind.tree;

import com.blind.tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreeMaximumPathSum {
	int max = 0;

	public int maxPathSum(TreeNode root) {
		if (root == null)
			return 0;
		max = root.val;
		int temp = maxPath(root);
		return Math.max(temp, max);
	}

	public int maxPath(TreeNode root) {
		if (root == null)
			return 0;

		int l = maxPath(root.left);
		int r = maxPath(root.right);

		if (l < 0)
			l = 0;
		if (r < 0)
			r = 0;

		int temp = l + r + root.val;

		max = Math.max(max, temp);

		if (l > r)
			return l + root.val;
		else
			return r + root.val;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
