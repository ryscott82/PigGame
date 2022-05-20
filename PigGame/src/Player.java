//i just want to apologize in advance for using break statements <3
import java.util.Arrays;
import java.util.Scanner;
public class Player {
    static Scanner scan = new Scanner(System.in);
    private String name;
    private String input = "null";
    private int total = 0;
    private int turnTotal = 0;
    Dice dice = new Dice();
    String[] RorH = {"R", "H"};
    final String RobotName = "Ollie The Computer";


    public Player (String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
    
    public int getTotal() {
      return total;
    }
    
    public void resetTotal() {
    	total = 0;
    }

    public void play() {
    	turnTotal = 0; //init a 0 turn total
    	int temp = total; //capture the total in case the player rolls a 1
    	
    	while(true) {
    		dice.roll();
    		turnTotal += dice.getRollTotal();
    		System.out.println("\t"+name+" rolled a "+ dice.getDice1()+" and a "+dice.getDice2()); //print out the dice totals
    		
    		if (dice.getDice1() == 1 && dice.getDice2() == 1) {
    			System.out.println("\n\tSince "+name+" rolled snake eyes, \n\t"+name+"'s total is now 0\n");
    			total = 0; //set total to 0
    			break; //end the turn
    		}
    		else if (dice.getDice1() == 1 || dice.getDice2() == 1) {
    			total = temp; //reset total to what it was before the turn started
    			System.out.println("\n\tSince "+name+" rolled a 1,\n\t"+name+" lost all the points from this round.\n");
    			break; //end the turn
    		}
    		else if (total+dice.getRollTotal()<99) {
    			total+=dice.getRollTotal();
    			System.out.println("\n\t"+name+"'s Turn Total Is: "+turnTotal+"\n\t"+name+"'s Total Is: "+total+"\n");
    			if (!(rollAgain())) //if the player does not want to roll again, end the turn
    				break; //end the turn
    		}
    		else {
    			total = temp+turnTotal;
    			System.out.println("\n\t"+name+"'s Total Is: "+total);
    			break; //end the turn
    		}
    	}
    }

    public boolean rollAgain(){
    	if (name.equals(RobotName)) { //if this is the computer
    		try {
				Thread.sleep(1500); //wait for 1500ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		if (turnTotal<20)
    			return true;
    		return false;
    	}
    	System.out.print("\tWould you like to roll or hold? (R or H):\t"); //ask if the user would like to roll or hold
        input = inputProtection(RorH); //get input from scanner
    	System.out.println();
    	if (input.equals("R")) //if user inputs 'R', go back to the main loop otherwise end the turn
    		return true;
    	return false;
      }
    
    private static String inputProtection(String[] allowed) {
  		boolean contains = false;
  		String input = " ";
  		while (contains == false) {
  			input = scan.next();
  	    	contains = Arrays.stream(allowed).anyMatch(input::equals);
  	    	if (contains == false) {
  	    		System.out.print("\tPlease try again:\t\t\t\t");
  	    	}
  		}	
  		return input;
    }
  }