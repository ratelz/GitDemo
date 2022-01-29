package reviewPackage;

public class FindMax {
	
	
	/*
	 * Task: Create a method that accepts 3 numbers and returns the largest of these
	 * 
	 * Ex: 1,5,7 Return 7
	 * 
	 */
	
	private int findMax(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		}
		else if (num2 > num1 && num2 > num3) {
			return num2;
		}
		else if (num3 > num1 && num3 > num2) {
			return num3;
		}
		else {
			return -1; // two or more of the same value: there's no max
		}
	}
	
	
	
	public static void main (String[]args) {
		// 1,5,7
		
		FindMax var = new FindMax ();
		System.out.println(var.findMax(2, 21321, 5));
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
