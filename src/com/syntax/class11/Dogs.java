package com.syntax.class11;

public class Dogs {
//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.

	String name;
	String breed;
	String color;
	double height;
	int age;
	char gender;

	public static void main(String[] args) {

		Dog FarhadsDog = new Dog();
		FarhadsDog.name = "Astro";
		FarhadsDog.breed = "Husky";
		FarhadsDog.color = "Black";
		FarhadsDog.height = 2.5;
		FarhadsDog.age = 10;
		FarhadsDog.gender = 'M';

		System.out.println("My dog Name is " + FarhadsDog.name);
		System.out.println("His breed is " + FarhadsDog.breed);
		System.out.println("His color is " + FarhadsDog.color);
		System.out.println("===================");

		Dog ScottsDog = new Dog();
		ScottsDog.name = "Balto";
		ScottsDog.breed = "Bulldog";
		ScottsDog.color = "Golden";
		ScottsDog.height = 5;
		ScottsDog.age = 12;
		ScottsDog.gender = 'M';

		System.out.println("My dog Name is " + ScottsDog.name);
		System.out.println("His breed is " + ScottsDog.breed);
		System.out.println("His color is " + ScottsDog.color);
		System.out.println("===================================");

		Dog SmithsDog = new Dog();
		SmithsDog.name = "Bingo";
		SmithsDog.breed = "Labrador";
		SmithsDog.color = "Black";
		System.out.println("Arwas Dog name is " + SmithsDog.name);
		System.out.println("His breed is " + SmithsDog.breed);
		System.out.println("His color is " + SmithsDog.color);
	}
}