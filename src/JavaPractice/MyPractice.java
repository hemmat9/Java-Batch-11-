package JavaPractice;

import java.util.Scanner;

public class MyPractice {

	public static void main(String[] args) {
		
		String [] name = {"Sharif","Ahmad","Kakar","Farhad"};
	
		System.out.println(name [3]);

		
		System.out.println("------------------------------------");
		
		

		String [][] names= {{"Ahmad", "Babak", "Ghafoor"},{"Baqi","Baqi Khan", "Abdul Baqi"},{"Baqi lala", "Baqi khan jan","Abdul Baqi raziq"}};
		System.out.println(names[2][1]);
		
		System.out.println(names[2].length);
		
		int total=0;
		for (int i=0; i<names.length; i++) {
			for (int j=0; j<names[i].length; j++) {
				System.out.print(names[i][j]+", ");
				total++;
			}
		}
		System.out.println();
		System.out.println(total);
	}

}
