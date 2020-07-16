package ticTacToe;
import java.util.*;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read User Input
		Scanner keyboard = new Scanner(System.in);
		String user_input;
		Boolean done = false;
		Boolean insert;
		
		TicTacToe ttt = new TicTacToe();
		
		System.out.println("Welcome To Tic Tac Toe");
		
		while(true) { //loops until user quits
			start_menu();
			user_input = keyboard.nextLine();
			
			while(user_input.length() != 1 || !Character.isDigit(user_input.charAt(0))) {
				System.out.println("Invalid input, try again!");
				start_menu();
				user_input = keyboard.nextLine();
			}
			
			if(user_input.equals("1")) { //Start the game
				int round = 0;
				System.out.println("Starting Game, Player will be X, Computer will be O\n");
				System.out.println(ttt.printBoard());
				
				//While the game is not done 
				while(!done) {
					int place = placement();
					insert = ttt.move(ttt.board, place, "player");
					while(!insert) {	//Checks whether inserted correctly 
						place = placement();
						insert = ttt.move(ttt.board, place, "player");
					}
					System.out.println(ttt.printBoard());
					round++;
					done = ttt.who_wins(round, ttt.winner());	//checks whether the game is done
					if(done == true) {
						break;
					}
					
					Random rand = new Random();
					int cpu = rand.nextInt(9) + 1;	//Randomize computers movements
					insert = ttt.move(ttt.board, cpu, "cpu");
					while(!insert) {	//Check whether inserted correctly
						cpu = rand.nextInt(9) + 1;
						insert = ttt.move(ttt.board, cpu, "cpu");
					}
					System.out.println(ttt.printBoard());
					round++;
					done = ttt.who_wins(round, ttt.winner()); //Checks whether the game is done
					if(done == true) {
						break;
					}
				}
				
			}
			else if(user_input.equals("2")) { //Exits the program
				System.exit(0);
			}
			else {
				System.out.println("Not an option, try again");
				continue;
			}

		}

	}
	
	/**
	 * Prints out the starting menu
	 */
	public static void start_menu() {
		System.out.println("Please Choose From The Following Options");
		System.out.println("1. Start Game");
		System.out.println("2. Quit");
		
	}
	
	/**
	 * Checks whether the placement is valid 
	 * @return place which square of placement
	 */
	public static int placement() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Your Placement (1-9)");
		int place = keyboard.nextInt();
		while(!(place > 0 && place < 10)) {
			System.out.println("Invalid, try again!");
			System.out.println("Enter Your Placement (1-9)");
			place = keyboard.nextInt();
		}
		
		return place;
	}

}
