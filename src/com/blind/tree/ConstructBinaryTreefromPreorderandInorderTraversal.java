package com.blind.tree;
// https://www.youtube.com/watch?v=PoBGyrIWisE
import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
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

	static int preorderIndex = 0;
	static Map<Integer, Integer> map;

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		return arrayToTree(preorder, 0, preorder.length - 1);
	}

	public static TreeNode arrayToTree(int[] preorder, int left, int right) {
		if (left > right)
			return null;

		int rootValue = preorder[preorderIndex++];
		TreeNode root = new TreeNode(rootValue);

		root.left = arrayToTree(preorder, left, map.get(rootValue) - 1);
		root.right = arrayToTree(preorder, map.get(rootValue) + 1, right);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
