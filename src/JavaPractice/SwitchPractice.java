package JavaPractice;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a country");
		String country = scanner.nextLine();
		String Language = null;
		switch (country) {
		case "USA":
			Language = "English";
			break;
		case "Afghanistan":
			Language = "Pashto & Dari";
			break;
		case "Pakistan":
			Language = "Urdu, English";
			break;
		case "India":
			Language = "Hindi";
			break;
		default:
			Language = "Please enter another country";
		}

			if (!Language.equals("Please enter another country")) {
			System.out.println("People in " + country + " speak " + Language);
			
			} else
				System.out.println("Please enter another country");
				
		}

	}
