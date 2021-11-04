package JavaPractice;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		/* HW: Using scanner class create calculator. Allow user to enter 2 numbers
		 * and operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter 2 consicitive numbers");
		double num1= scanner.nextDouble();
		double num2= scanner.nextDouble();
		System.out.println("Please select an operator + | - | * | / ");
		char operator = scanner.next().charAt(0);
		double result = 0;
		
		if (operator=='+') {
			result=num1+num2;
		} else if(operator=='-') {
			result=num1-num2;
		}else if(operator=='*') {
			result=num1*num2;
		}else if(operator=='/') {
			result=num1/num2;
		}else
			System.out.println("Wrong Entry");
		
		System.out.println("result = "+result);
		
		
		
	}
}
