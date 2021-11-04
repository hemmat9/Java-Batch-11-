package com.syntax.class07;

public class MoreForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 6; i++) {
			sum += i;
			System.out.println(sum); // syso insid is different that syso outside.

		}
		
		
		
		// syso here is different that syso inside.

		int result = 1;
		for (int i = 0; i <= 4; i++) { // any number multiplied by zero is 0.
			// change the incrementation/ decrementation part

			result *= i;

		}
		System.out.println(result);

	}
}