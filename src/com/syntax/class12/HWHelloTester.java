package com.syntax.class12;

import java.util.Scanner;

public class HWHelloTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HWHello greetings = new HWHello();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the country name to know the greetings");
		String greeting = scanner.nextLine();
		greetings.greetings(greeting);
	}

}
