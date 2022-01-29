package reviewPackage;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

	/*
	 * attempts-4;
	 * Scanner - read the user input
	 * Random - nextInt();
	 * 
	 */
	public static void main (String []args) {
		
	int attempts = 7;
	System.out.println("Welcome to the Prime Tech's guessing game!");
	System.out.println("You have a total of " + attempts + " attemts to guess the number between 0 and 100");	
		
	Scanner scanner = new Scanner(System.in);
	int guess = 0;
	
	Random random = new Random();
	int number = random.nextInt(100);
	
	do {
		System.out.println("You have " + attempts-- + "attemps left");
		System.out.println("Please enter a number: ");
		guess = scanner.nextInt();
		
		if (guess > number) {
			System.out.println("Less than");
			System.out.println("============");
			
		}
		else if (guess < number) {
			System.out.println("Greater than");
			System.out.println("============");
		}
		else {
			System.out.println("This is a corect number");
		}
		if (attempts == 0) {
			System.out.println("Sorry out of attempts");
			System.out.println("The number was: " + number);
			return;
		}	

	} while (guess !=number);
	
	scanner.close();
	
		
		
		
		
		
		
	}
}
