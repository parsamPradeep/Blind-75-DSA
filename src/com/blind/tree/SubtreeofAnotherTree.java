package com.blind.tree;

public class SubtreeofAnotherTree {
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
	public static boolean isSame(TreeNode p, TreeNode q) {
		if (q == null)
			return false;
		else if (isSameTree(p, q)) {
			return true;
		} else {
			return isSame(p.left, q) || isSame(p.right, q);
		}
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null)
			return q == null && q == null;
		else if (p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		else
			return false;
	}

	// Approach - 2
	public boolean isSubtree(TreeNode s, TreeNode t) {
		// s
		StringBuilder sb = new StringBuilder();
		preorder(s, sb);
		String seqS = sb.toString();
		// t
		sb = new StringBuilder();
		preorder(t, sb);
		String seqT = sb.toString();

		return seqS.indexOf(seqT) >= 0;
	}

	private void preorder(TreeNode t, StringBuilder sb) {
		if (t == null) {
			sb.append("null");
			return;
		}
		sb.append("#" + t.val);
		preorder(t.left, sb);
		preorder(t.right, sb);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
