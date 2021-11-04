package JavaPractice;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int i = 1;
		while (i<=5) {
		System.out.println("Please enter your name and age");
		String name=scan.next();
		int age=scan.nextInt();
		System.out.println("You name is "+name+" and your age is "+age);
		i++;
		}
	}
}
