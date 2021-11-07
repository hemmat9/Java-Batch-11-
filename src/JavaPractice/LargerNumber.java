package JavaPractice;

public class LargerNumber {
//Create a method that will take a number and prints whether the number is even or odd.
	
	void  number (int num1) {
		if (num1%2==0) {
			System.out.println(num1+" is even");
		} else {
			System.out.println(num1+ " is odd");
		}
	}
	
	public static void main (String [] args) {
		
		LargerNumber farhad = new LargerNumber();
		farhad.number(45);
		
		
	}
}
