import java.util.Scanner;
import java.util.Arrays;
public class PigGame {
   static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    String input = "null"; //temporary String for user input
    final String RobotName = "Ollie The Computer";
    String[] playerInputProtection = {"1", "2"};

    System.out.println("Welcome to the Game of Pig!");
    System.out.print("How many Players? (1 or 2):\t");
  
    input = inputProtection(playerInputProtection); //get input from scanner
    Player player1;
    Player player2;

    
    if(input.equals("2")) {
    	System.out.print("Enter Player 1 Name:\t\t");
    	input = scan.nextLine();
    	input = scan.nextLine();
    	player1 = new Player (input);
    	System.out.print("Enter Player 2 Name:\t\t");
    	input = scan.nextLine();
    	player2 = new Player (input);
    	System.out.println();
    }
    else {
    	System.out.print("Enter Your Name:\t\t");
    	input = scan.nextLine();
    	input = scan.nextLine();
    	player1 = new Player(input);
    	player2 = new Player(RobotName);
    	System.out.print("\nHi, I'm Ollie The Computer! ");
    }

    System.out.println("Let's Play!\n");
    while (true) {
    	while (player1.getTotal()<100 && player2.getTotal()<100) { //while nobody has won
    		    		
    		if (player2.getTotal()<100) { //if player 2 hasn't won
    			System.out.println("It's "+player1.getName()+"'s Turn:\n");
    			player1.play(); 		//player 1 gets to play
    		}
    		       
    		if(player1.getTotal()<100) { //if player 1 hasn't won
    			System.out.println("It's "+player2.getName()+"'s Turn:\n");
    			player2.play();			//player 2 gets to play
    		}
    }
    	if (player1.getTotal() >=100) //if player 1 won, show that they won
    		System.out.println(player1.getName()+" wins!");
    	else if (player2.getTotal() >=100) //if player 2 won, show that they won
    		System.out.println(player2.getName()+" wins!");
    	
    	System.out.print("\nPress Y to play again, Press any other character to quit:\t"); //ask to play again
    	input = scan.nextLine();
    	if (input.equals("Y")) { //if the player wants to play again, reset the totals and go back to the main loop
    		player1.resetTotal();
    		player2.resetTotal();
    	}
    	else //if player does not want to play again
    		System.exit(0); //terminate the program
    }
  }

  private static String inputProtection(String[] allowed) {
		boolean contains = false;
		String input = " ";
		while (contains == false) {
			input = scan.next();
	    	contains = Arrays.stream(allowed).anyMatch(input::equals);
	    	if (contains == false) {
	    		System.out.print("Please try again: ");
	    	}
		}	
		return input;
  }
}