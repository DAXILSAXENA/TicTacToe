package com.bridgelabz.TicTacToe;

public class TicTacToeGame {

	/* UC 1 */
	private static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		char[] board = createBoard();
	}
}
