package march24_reviewSession;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("You in class?");
		
		boolean bool = scan.nextBoolean();
		System.out.println(bool);

	}

}
