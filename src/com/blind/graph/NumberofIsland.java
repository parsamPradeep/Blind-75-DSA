package com.blind.graph;

public class NumberofIsland {
	 public int numIslands(char[][] grid) {
	        int count = 0;
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[i].length;j++){
	                if(grid[i][j]=='1'){
	                    dfs(i,j,grid);
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	    
	    public void dfs(int i, int j, char[][] grid){
	        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0')
	            return;
	        grid[i][j]='0';
	        dfs(i+1,j,grid);
	        dfs(i,j+1,grid);
	        dfs(i-1,j,grid);
	        dfs(i,j-1,grid);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
