package JavaPractice;

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
	 
		Scanner name = new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String name1 = name.nextLine();
		System.out.println("Please Enter Last Name");
		String LastName = name.nextLine();
		System.out.println(name1+ " "+LastName);
	}
}