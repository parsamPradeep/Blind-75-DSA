package com.blind.matrix;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
