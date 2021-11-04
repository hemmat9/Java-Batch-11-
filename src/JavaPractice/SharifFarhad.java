package JavaPractice;

import java.util.Scanner;

public class SharifFarhad {
	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your height in inches.");
		int height = scanner.nextInt();

		if (height < 60) {
			System.out.println("You are short");
		} else if (height > 60 & height <= 72) {
			System.out.println("You are medium");
		} else {
			System.out.println("You are tall");
		}

	}
}