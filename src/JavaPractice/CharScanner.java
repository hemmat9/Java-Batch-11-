package JavaPractice;

import java.util.Scanner;

public class CharScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a char");
		char c = scanner.next().charAt(5);
		System.out.println(c);

	}

}
