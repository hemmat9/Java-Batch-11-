package JavaPractice;

import java.util.Scanner;

public class Wahab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumOfOdd = 0;
		int sumOfEven = 0;
		int userValue = 0;

		System.out.println("Please enter 6 different numbers: ");
		for (int i = 0; i <= 5; i++) {
			Scanner scanner = new Scanner(System.in);
			userValue = scanner.nextInt();
			if (userValue % 2 == 0) {
				sumOfEven += userValue;
			} else {
				sumOfOdd += userValue;
			}
		}
		System.out.println("Sum of even number is: " + sumOfEven + " and sum of odd is " + sumOfOdd);
	}
}