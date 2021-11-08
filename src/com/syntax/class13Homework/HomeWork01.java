package com.syntax.class13Homework;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// Write a program that reads two people's first
		// names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL
		String DadName = "Daniel";
		String MomName = "Mary";
		String ExChild = "Boy";
		String ExChild2 = "Girl";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Mom's first name");
		String Fname = scanner.nextLine();
		System.out.println("Enter Dad's first name");
		String Lname = scanner.nextLine();
		System.out.println("Are you expecting a boy or a girl?");
		String ExpChild = scanner.nextLine();
		if (ExpChild.equalsIgnoreCase(ExChild)) {
			System.out.println("Suggested baby name: " + DadName.substring(0, 3).toUpperCase()
					+ (MomName.substring(2).toUpperCase()));
		} else if (ExpChild.equalsIgnoreCase(ExChild2)) {
			System.out.println("Suggested baby name: " + MomName.substring(0, 2).toUpperCase()
					+ (DadName.substring(3, 6).toUpperCase()));
		}
	}

}
