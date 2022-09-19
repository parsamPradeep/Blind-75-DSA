package com.blind.matrix;
// https://www.youtube.com/watch?v=fMSJSS7eO1w
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
	 
	 public static void rotate2(int[][] matrix) {
	       int l=0, r=matrix[0].length-1;
	       int top=0, bottom=matrix.length-1;
	        
	        while(l<r){
	        	for(int i=0;i<(r-l);i++) {
	                int tempTopLeft = matrix[top][l + i];
	                
	                matrix[top][l + i] = matrix[bottom - i][l];
	                
	                matrix[bottom - i][l] = matrix[bottom][r - i];
	                
	                matrix[bottom][r - i] = matrix[top + i][r];
	                
	                matrix[top + i][r] = tempTopLeft; 
	        	}
	        	r--;
	        	l++;
	        	top++;
	        	bottom--;
	        }
	         
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		rotate2(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}

}
