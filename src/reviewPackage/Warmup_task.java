package reviewPackage;

public class Warmup_task {
 
	
	

	/*	-Create a variable of type long and 
	 * name length and assign a value of it;
	 *  
	 *  
	 * 
	 * - Create a variable of type long and
	 * name width and assign a value to it;
	 * 
	 * 
	 * 
	 *  - Create a variable of type int and name sqFootage and assign a value 
	 *  based on proper mathematical calculation of sq footage (length * width)
	 * 
	 */
	public static void main(String[] args) {
	 long length = 5, width = 3;
	 
	 // 4-byte 			8-byte
	 int sqFootage = (int) (length * width); // narrowing
	 
	 System.out.println (sqFootage); }
	 
	// String, long 
	char char1 = 'A';
	String text = "10"; // non-primitive data type
	
	 // long long1 = (long) text; //  can't cast this
	
	
}
