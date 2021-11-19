package JavaPractice;

public class Dog {

	// we have 3 types of variables 1; Instance variables 2; local Variables 3; Static Variable
	String name; //attributes, properties, state
	String breed;
	String color;
	int weight;
	int age;
	double hieght;
	char gender;
	static int noOfLegs=4;
	
	
	
	
	
	
	
	void bark() {
		if (name.equals("Boby")) {
			System.out.println("I don't know this dog");
		}else {
		System.out.println(name + " can bark and he is " + age+ " years old");
		}
	}
	void eat() {
		System.out.println(name + " can eat alot and he weights "+ weight);
	}
	void play () {
		System.out.println(name + " can play and he has "+noOfLegs+" legs");
	}
}
