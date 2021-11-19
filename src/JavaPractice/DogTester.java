package JavaPractice;


public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog();
		
		dog1.name="Mike";
		dog1.breed="Bulldog";
		dog1.color="Black";
		dog1.age=5;
		dog1.gender='M';
		dog1.hieght=6.5;
		dog1.weight=25;
		dog1.bark();
		dog1.play();
		dog1.eat();
		System.out.println(dog1.name);
		System.out.println(dog1.breed);
		
		
		
	}

}
