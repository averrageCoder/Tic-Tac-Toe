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
	
	private static void showBoard() {
		
		System.out.println("\n CURRENT BOARD POSITION:");
		for(int rowIndex=0; rowIndex<3; rowIndex++) {
			for(int colIndex=0; colIndex<3; colIndex++) {
				System.out.print(board[rowIndex+colIndex+1]+" | ");
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String args[]) {
		
		createBoard();
		readInputChoice();
		showBoard();
		scan.close();
		
	}
	
}
