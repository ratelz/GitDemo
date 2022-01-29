package reviewPackage;

public class warmupOperations {
 public static void main (String []args) {
	 
	 
	// Java executes the code from top to bottom
		
			int num1 = 9;
			int num2 = 2;
			int num3 = 5;
			
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2); // takes the precedence 
			System.out.println(num1 / num2); // takes the precedence 
			System.out.println(num1 % num2); // takes the precedence
			
			System.out.println(num1 + num2 * num3);
			System.out.println(num3 % num2 + num3);
			
			System.out.println(num3 * (num2 + num3));
							   // 5 * (2 + 5) = 35
			
			// x > y
			
			int x = 25;
			int y = 10;
			
			boolean compare =  x > y;
			System.out.println(compare);
			
					
			
 }
 
}
