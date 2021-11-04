package com.syntax.class06;

public class WhileDemo {

	public static void main(String[] args) {

		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");

		int a = 1;
		while (a <= 10) {

			if (a % 2 == 0) {
				System.out.print(a+ " ");
			}
			a++;
		}
	}

}
