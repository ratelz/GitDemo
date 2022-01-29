package reviewPackage;

public class Count_Words {
	
	/*
	 * Purpose: To obtain the count for a specific word
	 */
	
	public static void main (String[]args) {
	String str = "I would love to have a computer, and once I finish I will get a computer";

	int count = 0;
	
	for (int i = 0; i < str.length()-2; i++) {
		if (str.substring(i,i+3).equals("computer")) {
			count++;
		}
	}

				System.out.println(count);
				

	
	
	
	
	}

}