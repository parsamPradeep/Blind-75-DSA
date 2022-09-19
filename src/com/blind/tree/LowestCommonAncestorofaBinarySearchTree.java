package com.blind.tree;

public class LowestCommonAncestorofaBinarySearchTree {
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

	 public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null)
	            return null;
	        if(root.val==p.val || root.val==q.val) 
	            return root;
	        TreeNode leftLCA=lowestCommonAncestor(root.left,p,q);
	        TreeNode rightLCA=lowestCommonAncestor(root.right, p, q);
	        
	        if(leftLCA!=null && rightLCA!=null)
	            return  root;
	        return leftLCA!=null?leftLCA:rightLCA;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
