package com.blind.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneGraph {
	class Node {
	    public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
	 public Node cloneGraph(Node node) {
	        if(node == null) return null;
	        Node copy=new Node(node.val);
	        Node visited[] = new Node[101];
	        Arrays.fill(visited, null);
	        dfs(copy, node, visited);
	        return copy;
	    }
	    public void dfs(Node copy, Node node, Node[] visited){
	        visited[copy.val]=copy;
	        
	        for(Node n: node.neighbors){
	            if(visited[n.val]==null){
	                Node newNode=new Node(n.val);
	                copy.neighbors.add(newNode);
	                dfs(newNode, n, visited );
	            }else{
	                copy.neighbors.add(visited[n.val]);
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
