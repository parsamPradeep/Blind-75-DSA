package com.blind.tree;

import java.util.Stack;


public class ValidateBinarySearchTree {

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

	public static boolean validBST1(TreeNode root) {
		TreeNode pre = null;
		Stack<TreeNode> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (pre != null && root.val <= pre.val)
				return false;
			pre = root;
			root = root.right;
		}
		return true;
	}
	// approach - 2 
	static TreeNode pre=null;
	public static boolean isValidBST2(TreeNode root) {
        return inorder(root);
    }
    public static boolean inorder(TreeNode root){
        if(root==null)
            return true;
        if(!inorder(root.left)){
            return false;
        }
        if(pre!=null && root.val<=pre.val)
            return false;
        pre=root;
        return inorder(root.right);
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.val = 5;
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);
		System.out.println(validBST1(root));

	}

}
