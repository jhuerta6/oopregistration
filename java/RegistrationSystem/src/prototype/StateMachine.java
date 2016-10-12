/*
 * Topher Tighe
 * 10/11/16
 * This program follows a state machine based on user input.
 */

package prototype;

import java.util.Scanner;

public class StateMachine {
	static int state = 1; //State 1 is Normal
				   //State 2 is Recovery Identification
				   //State 3 is Pressure Recovery
				   //State 4 is Temperature Recovery
				   //State "5" exits the state machine

	public static void main(String[] args) {
		while (state < 5) {
			input();
		}
	}

	//Gives user instructions, takes user input, and performs the proper event.
	public static void input(){
		Scanner input = new Scanner(System.in);
		System.out.println(); //For formatting sake.
		System.out.println("Please enter the first letter of the event you desire. (not case-sensitive)");
		System.out.println("[A]nomaly");
		System.out.println("[P]ressure");
		System.out.println("[T]emperature");
		System.out.println("[S]uccess, recovery");
		System.out.println("[F]ailure, recovery");
		System.out.println("[C]urrent state, print");
		System.out.print("ENTER HERE: ");
		
		char next = input.next().charAt(0);
		switch (next) {
		case 'a': case 'A':
			anomaly();
			break;
		case 'p': case 'P':
			pressure();
			break;
		case 't': case 'T':
			temperature();
			break;
		case 's': case 'S':
			success();
			break;
		case 'f': case 'F':
			fail();
			break;
		case 'c': case 'C':
			printState();
			break;
		default:
			System.out.println("Invalid input. Please try again.");
			input();
			break;
		}
	}//end input
	
	//Reads state as a number and prints out it's name.
	public static void printState(){
		System.out.print("Current State: ");
		switch (state) {
		case 1:
			System.out.println("Normal");
			break;
		case 2:
			System.out.println("Recovery Identification");
			break;
		case 3:
			System.out.println("Pressure Recovery");
			break;
		case 4:
			System.out.println("Temperature Recovery");
			break;
		}
	}//end printState
	
	/**The following are all the possible events in the state machine*/
	
	public static void anomaly(){
		if (state == 1) {
			System.out.println("Moving from NORMAL to RECOVERY IDENTIFICATION.");
			state = 2;
		}
	}//end anomaly
	
	public static void pressure(){
		if (state == 2) {
			System.out.println("Moving from RECOVERY IDENTIFICATION to PRESSURE RECOVERY.");
			state = 3;
		}
	}//end pressure
	
	public static void temperature(){
		if (state == 2) {
			System.out.println("Moving from RECOVERY IDENTIFICATION to TEMPERATURE RECOVERY.");
			state = 4;
		}
	}//end temperature
	
	public static void success(){
		if (state == 2 || state == 3 || state == 4) {
			System.out.println("Recovery successful. Returning to NORMAL state.");
			state = 1;
		}
	}//end success
	
	public static void fail(){
		if (state == 2 || state == 3 || state == 4) {
			System.out.println("Recovery failed. Exiting state machine.");
			state = 5;
		}
	}//end fail
}





