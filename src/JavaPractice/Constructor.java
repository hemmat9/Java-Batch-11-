package JavaPractice;

public class Constructor {

	String name;
	String color;
	int age;
	
	Constructor (String name, String color, int age){
		this.name=name;
		this.color=color;
		this.age=age;
		
		
	}
	public void printInfo() {
		System.out.println(name+" "+color+" "+age);
	}
}
