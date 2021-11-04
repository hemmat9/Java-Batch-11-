package JavaPractice;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		/*
		 * lets create a secret number (1 to 100) lets ask user to guess my secret
		 * number keep asking for a number till user guess the secret number
		 */

	int num=1;
	
	while (num<=50) {
		
		if (num%2!=0)
		System.out.print(num+ " ");
		num++;
	}
	
	
	}
}