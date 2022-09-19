package com.blind.matrix;

import java.util.Arrays;
// https://leetcode.com/problems/set-matrix-zeroes/solution/
//https://www.youtube.com/watch?v=M65xBewcqcI
public class SetMatrixZeroes {
	public static void setZeroes(int[][] matrix) {
		boolean visited[][] = new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0 && !visited[i][j])
					fillZeros(matrix, visited, i, j);
			}
		}
	}

	public static void fillZeros(int[][] matrix, boolean visited[][], int row, int col) {
		System.out.println(row + " " + col + " " + matrix[0].length);
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[row][i] != 0)
				visited[row][i] = true;
			matrix[row][i] = 0;
		}
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] != 0)
				visited[i][col] = true;
			matrix[i][col] = 0;
		}
	}
	
	// Approach - 2
	  public void setZeroes2(int[][] matrix) {
	        
	        boolean firstCol = false;
	        boolean firstRow = false;
	        
	        for(int i=0; i<matrix.length; i++){
	            if(matrix[i][0] == 0){
	                firstCol = true;
	                break;
	            }
	        }
	        
	        for(int i=0; i<matrix[0].length; i++){
	            if(matrix[0][i] == 0){
	                firstRow = true;
	                break;
	            }
	        }
	        
	        for(int i=1; i<matrix.length; i++){
	            for(int j=1; j<matrix[i].length; j++){
	                if(matrix[i][j] == 0){
	                    matrix[0][j] = 0;
	                    matrix[i][0] = 0;
	                }
	            }
	        }
	        
	        for(int i=1; i<matrix.length; i++){
	            for(int j=1; j<matrix[i].length; j++){
	                if(matrix[i][0] == 0 || matrix[0][j] == 0){
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	        
	        if(firstCol){
	            for(int i=0; i<matrix.length; i++){
	                matrix[i][0] = 0;
	            }
	        }
	        
	        if(firstRow){
	            for(int j=0; j<matrix[0].length; j++){
	                matrix[0][j] = 0;
	            }
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
