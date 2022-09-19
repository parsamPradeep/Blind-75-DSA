package com.blind.tree;

//https://leetcode.com/problems/invert-binary-tree/discuss/62719/My-simple-recursion-java-solution

public class InvertBinaryTree {
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
	//Approach - 1 
	public static TreeNode invertTree(TreeNode root) {
	     invertTreeHelp(root);
	        return root;
	    }
	    public static void invertTreeHelp(TreeNode root){
	         if(root == null)
	          return;
	        TreeNode temp=root.left;
	            root.left=root.right;
	            root.right=temp;
	        invertTreeHelp(root.left);
	        invertTreeHelp(root.right);
	    }
	    //Approach - 2
	    public static TreeNode invertTree2(TreeNode root) {
	    	 if(root == null) return null;
	         TreeNode tmp = root.left;
	         root.left = invertTree2(root.right);
	         root.right = invertTree2(tmp);
	         return root;
	    }
	    // Approach - 3 post-order traversal
	    public static TreeNode invertTree3(TreeNode root) {
	        invertTreeHelp(root);
	          return root;
	      }
	      public static void invertTreeHelp3(TreeNode root){
	          if(root == null) return;
	         invertTree(root.left);
	          invertTree(root.right);
	          TreeNode temp=root.left;
	          root.left=root.right;
	          root.right=temp;
	      } 
	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.val = 5;
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);
		System.out.println(invertTree(root));

	}

}
