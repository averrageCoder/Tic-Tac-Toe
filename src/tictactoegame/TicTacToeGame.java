package tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {

	private static char board[] = new char[10];
	private static char userInput, computerInput;
	private static Scanner scan = new Scanner(System.in);
	
	private static void createBoard() {
		for(int index=1; index<10; index++) {
			board[index] = ' ';
		}
	}
	
	private static void readInputChoice() {
		
		System.out.println("Enter input choice: \n1. X \n2. O \nENTER YOUR CHOICE: ");
		int choice = scan.nextInt();
		
		if(choice==1) {
			userInput='X';
			computerInput = 'O';
		}
		else {
			userInput='O';
			computerInput = 'X';
		}
		
	}
	
	public static void main(String args[]) {
		
		createBoard();
		readInputChoice();
		scan.close();
		
	}
	
}
