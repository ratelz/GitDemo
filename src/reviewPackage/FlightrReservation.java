package reviewPackage;

import java.util.Scanner;

public class FlightrReservation {
	public static void main(String [] args) {
		
		// Destination - done
		// Origin - done
		// Date
		// One-way or round trip - done
		// Class
		boolean session = true;
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("WELCOME TO THE DIMASIK EXPEDIA!");
			System.out.print("WHERE ARE YOU FLYING FROM? (ex. Los Angeles)" + "\nEnter your origin city: ");
			String origin = scanner.next().toUpperCase();
			System.out.print("\nSELECT DESTINATION: \n\n" + "1. Las Vegas, NV\n" + "2. Miami, FL\n"
					+ "3. New York, NY\n" + "\nEnter selection: ");
			String destination = "";
			switch (scanner.nextInt()) {
			case 1:
				destination = "Las Vegas, NV";
				break;
			case 2:
				destination = "Miami, FL";
				break;
			case 3:
				destination = "New York, NY";
				break;
			default:
				System.out.print("PROGRAM IS BROKEN: 404");
			}
			destination = destination.toUpperCase();
			
			System.out.print("\nIS THIS A ROUND TRIP OR ONE-WAY?\n\n" + "1. One-Way\n" + "2. Round Trip\n\n"
					+ "Enter selection: ");
			String tripType = scanner.nextInt() == 1 ? "One-Way" : "Round Trip";
			System.out.print("\nSELECT DEPARTURE DATE: \n\n" + "1. 07/15/2021\n" + "2. 03/31/2021\n"
					+ "3. 04/01/2021\n\n" + "Enter selection: ");
			String departureDate = "";
			switch (scanner.nextInt()) {
			case 1:
				departureDate = "07/15/2021";
				break;
			case 2:
				departureDate = "03/31/2021";
				break;
			case 3:
				departureDate = "04/01/2021";
				break;
			default:
				session = false;
				return;
			}
			String returnDate = "";
			if (tripType.equals("Round Trip")) {
				System.out.print("\nSELECT RETURN DATE: \n\n" + "1. 07/15/2021\n" + "2. 03/31/2021\n"
						+ "3. 04/01/2021\n\n" + "Enter selection: ");
				switch (scanner.nextInt()) {
				case 1:
					returnDate = "07/15/2021";
					break;
				case 2:
					returnDate = "03/31/2021";
					break;
				case 3:
					returnDate = "04/01/2021";
					break;
				default:
					System.out.println("SELECTION DOESN'T EXIST");
				}
			}
			System.out.print("\n YOU BOOKED A FLIGHT FROM " + origin + " TO " + destination + " ON " + departureDate);
			if (tripType.equals("Round Trip")) {
				System.out.print(" WITH RETURNING FLIGHT ON " + returnDate + "\n");
			}
			System.out.print("\nIS THIS CORRECT: \n\n" + "1. YES\n" + "2. NO\n\n" + "Enter selection: \n");
			String confirmation = scanner.nextInt() == 1 ? "YES" : "NO";
			if (confirmation.equals("YES")) {
				System.out.println("THANK YOU FOR CHOOSING DIMASIK EXPEDIA");
				session = false;
			} else {
				System.out.println("Let's start over \n\n");
			}
		} while (session);
	
		
		
		
		
		
		
	}

}
