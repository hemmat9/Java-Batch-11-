package com.syntax.class14Homework;

public class Class14Homework2 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many alpha characters are there in the String.

		String str = "abc$%defg12@3ZGU45#&*";

		int alpha = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				alpha++;

			}
		}
		System.out.print("There are " + alpha + " alphabets in this string");

	}
}
