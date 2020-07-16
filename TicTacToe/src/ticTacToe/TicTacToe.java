package ticTacToe;

public class TicTacToe {
	private final int row = 3;
	private final int column = 3;
	String[][] board;
	
	/**
	 * Constructor for the class
	 */
	public TicTacToe() {
		board = new String[row][column];
		this.initialize();
	}
	
	/**
	 * Initialize the tic tac toe board
	 */
	public void initialize() {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				board[i][j] = "   ";
			}
		}
	}
	
	/**
	 * Prints the board
	 * @return bo the board
	 */
	public String printBoard() {
		String bo = "";
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(j == 2) {
					bo += board[i][j];
				}
				else {
					bo += board[i][j] + "|";
				}
		
			}
			bo += "\n---+---+---\n";
		}
		return bo;
	}
	
	/**
	 * Determine which player moves
	 * @param board the tic tac toe board
	 * @param pos the square of placement
	 * @param user which users turn
	 * @return insert if it has been correctly inserted
	 */
	public boolean move(String[][] board, int pos, String user) {
		String symbol = " ";
		boolean insert = true;
		
		if(user.equals("player")) {
			symbol = "X";
		}
		else {
			symbol = "O";
		}
		//Which box inserted to
		switch(pos) {
			case 1: 
				if(board[0][0].equals("   ")) {
					board[0][0] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 2: 
				if(board[0][1].equals("   ")) {
					board[0][1] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 3: 
				if(board[0][2].equals("   ")) {
					board[0][2] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 4: 
				if(board[1][0].equals("   ")) {
					board[1][0] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 5: 
				if(board[1][1].equals("   ")) {
					board[1][1] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 6: 
				if(board[1][2].equals("   ")) {
					board[1][2] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 7: 
				if(board[2][0].equals("   ")) {
					board[2][0] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 8: 
				if(board[2][1].equals("   ")) {
					board[2][1] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			case 9: 
				if(board[2][2].equals("   ")) {
					board[2][2] = " " + symbol + " ";
					break;
				}
				else {
					if(user.equals("player")) {
						System.out.println("Space Occupied, Try Again");
					}
					insert = false;
					break;
				}
			default:
				break;
		}
		
		return insert;
		
	}
	
	
	/**
	 * Checks for winning row 
	 * @return true if there is a winner
	 */
	public boolean winner() {
		
		for(int i = 0; i < row; i++) {
			if(!board[i][0].equals("   ") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
				return true;
			}
		}
		
		for(int j = 0; j < column; j++) {
			if(!board[0][j].equals("   ") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
				return true;
			}
		}
		
		if(!board[0][0].equals("   ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
    		return true;
    	if(!board[0][2].equals("   ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
    		return true;
		
    	return false;
		
	}
	
	/**
	 * Decides who wins or if its a tie
	 * @param round which round of turns
	 * @param win if there is a winner
	 * @return true end of game
	 */
	public boolean who_wins(int round, boolean win) {
		if(round == 9 && win == false) {
			System.out.println("Its a Tie! :/\n");
			return true;
		}
		else if((round % 2 == 0) && win == true) {
			System.out.println("Computer Wins!");
			System.out.println("You Lose! :(\n");
			return true;
		}
		else if(round % 2 == 1 && win == true) {
			System.out.println("You win! :)\n");
			return true;
		}
		return false;
		
	}
	
}
