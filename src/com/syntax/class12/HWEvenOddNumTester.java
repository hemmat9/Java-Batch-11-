package com.syntax.class12;

import java.util.Scanner;

public class HWEvenOddNumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HWEvenOddNum number = new HWEvenOddNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		number.number(num);
		
	}

}
