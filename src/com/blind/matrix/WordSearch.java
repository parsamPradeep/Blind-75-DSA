package com.blind.matrix;

//https://www.youtube.com/watch?v=vYYNp0Jrdv0
public class WordSearch {
	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word))
					return true;
			}
		}
		return false;
	}

	public static boolean dfs(char board[][], int i, int j, int count, String word) {
		if (count == word.length())
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count))
			return false;

		char temp = board[i][j];
		board[i][j] = ' ';
		boolean found = dfs(board, i + 1, j, count + 1, word) || dfs(board, i - 1, j, count + 1, word)
				|| dfs(board, i, j + 1, count + 1, word) || dfs(board, i, j - 1, count + 1, word);
		board[i][j] = temp;
		return found;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char borad[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		System.out.println(exist(borad, word));
	}

}
