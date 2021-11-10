package com.syntax.class14Homework;

public class Class14Homework6 {

	public static void main(String[] args) {
		// How would you check if String is polindrome or not?

		String original = "Madam";
		String Rev_Orig = "";

		for (int i = original.length() - 1; i >= 0; i--) {

			Rev_Orig = Rev_Orig + original.charAt(i);
		}

		if (Rev_Orig.equalsIgnoreCase(original)) {
			System.out.println(original + " is Polindrome String");
		} else {
			System.out.println(original + " is Not Polinderome String");
		}

	}

}