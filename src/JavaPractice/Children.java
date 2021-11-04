package JavaPractice;

import java.util.Scanner;

public class Children {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		if(name.equalsIgnoreCase("Farhad")) {
			System.out.println(name+" was born in 1988. He is 33 years old and he is married. He has 3 Children and they live in the United State of America since 2017");
		}else {
			System.out.println("You did not enter a name.");
		}

	}
}
