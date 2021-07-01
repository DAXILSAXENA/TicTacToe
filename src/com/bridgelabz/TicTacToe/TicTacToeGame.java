package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {

	/* UC 1 */
	private static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	/* UC 2 */
	private static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your Letter: ");
		return userInput.next().toUpperCase().charAt(0);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		char[] board = createBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
	}
}
