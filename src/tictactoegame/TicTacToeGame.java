package tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {

	private static char board[] = new char[10];
	private static char userInput, computerSymbol;
	private static Scanner scan = new Scanner(System.in);
	
	private static boolean userPlaysFirst;
	
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
			computerSymbol = 'O';
		}
		else {
			userInput='O';
			computerSymbol = 'X';
		}
		
	}
	
	private static void showBoard() {
		
		System.out.println("\nCURRENT BOARD POSITION:");
		for(int rowIndex=0; rowIndex<3; rowIndex++) {
			for(int columnIndex=0; columnIndex<3; columnIndex++) {
				System.out.print(" [ "+board[3*rowIndex+columnIndex+1]+" ] ");
			}
			System.out.print("\n");
		}
		
	}
	
	private static int readMoveLocation() {
		
		System.out.println("Enter desired location[1-9]:");
		return scan.nextInt();
		
	}
	
	private static boolean checkIfAvailable(int moveLocation) {
		
		if(board[moveLocation]== ' ')
			return true;
		else
			return false;
	}
	
	private static void checkWhoPlaysFirst() {
		
		if(Math.random() > 0.5) {
			userPlaysFirst = true;
			System.out.println("User plays first!");
		}
		else {
			userPlaysFirst = false;
			System.out.println("Computer plays first!");
		}
		
	}
	
	public static void main(String args[]) {
		int iteration=0;
		createBoard();
		readInputChoice();
		showBoard();
		checkWhoPlaysFirst();
		while(true) {
			if((!userPlaysFirst && iteration%2==1) || (userPlaysFirst && iteration%2==0)) {
				while(true) {
					int moveLocation = readMoveLocation();
					if(checkIfAvailable(moveLocation)) {
						board[moveLocation] = userInput;
						break;
					}
					else
						System.out.println("Location not free!");
				}
			}
			else {
				while(true) {
					int moveLocation = (int) Math.floor(Math.random()*10);
					System.out.println(moveLocation);
					if(checkIfAvailable(moveLocation)) {
						board[moveLocation] = computerSymbol;
						break;
					}
					else
						System.out.println("Location not free!");
				}
			}
			iteration++;
			showBoard();
			if(iteration == 9)
				break;
		}
		scan.close();
		
	}
	
}
