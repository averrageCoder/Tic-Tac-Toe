package tictactoegame;

public class TicTacToeGame {

	private static char board[] = new char[10];
	
	private static void createBoard() {
		for(int index=1; index<10; index++) {
			board[index] = ' ';
		}
	}
	
	public static void main(String args[]) {
		
		createBoard();
		
	}
	
}
