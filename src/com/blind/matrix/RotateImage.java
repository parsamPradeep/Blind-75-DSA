package com.blind.matrix;

public class RotateImage {
	 public static void rotate(int[][] matrix) {
	        for(int i=0;i<matrix.length;i++){
	            int r=matrix[i].length-1;
	            for(int j=0;j<matrix[i].length/2;j++){
	               int temp=matrix[i][r];
	                matrix[i][r]=matrix[i][j];
	                matrix[i][j]=temp;
	                r--;
	          }
	        }
	        
	        for(int i=0;i<matrix.length;i++){
	            int col=matrix[i].length-i-1;
	            int row=matrix.length-1;
	            for(int j=0;j<matrix[0].length-i-1;j++){
	                int temp=matrix[row][col];
	                matrix[row][col]=matrix[i][j];
	                matrix[i][j]=temp;
	                row--;
	            }
	        }

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}

}
