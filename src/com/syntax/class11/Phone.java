package com.syntax.class11;

public class Phone {
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	
	
	String name;
	String brand;
	String colors;
	int weight;
	String display;
	String made;
	
	void music() {
		System.out.println(name + " can play music and vidoes with "+ display);
	}
	
	void internet() {
		System.out.println(name + " is enabled to be connected to the internet");
	}
	
	void calls() {
		System.out.println(name + " enables you to make calls and text and it just weights "+ weight+"grs");
	}
	
	public static void main(String[] args) {
		Phone iPhone=new Phone();
		iPhone.name="iPhone";
		iPhone.made="United States";
		iPhone.display="HD Display";
		iPhone.weight=200;
		iPhone.colors="Black, white, red, gold";
		System.out.println("Name: "+iPhone.name);
		System.out.println("Made in: "+iPhone.made);
		System.out.println(iPhone.name+" has "+iPhone.display+" Display");
		System.out.println(iPhone.name+ " is available in colors "+ iPhone.colors);
		iPhone.music();
		iPhone.calls();
		iPhone.internet();
		System.out.println("========================================================");
		Phone Nokia = new Phone();
		Nokia.name="Nokia";
		Nokia.made="Finland";
		Nokia.display="IPS LCD";
		Nokia.weight=160;
		Nokia.brand="Nokia";}
		
		
		void music1() {
			System.out.println(name + " can play music and vidoes with "+ display);
		}
		
		void internet2() {
			System.out.println(name + " is enabled to be connected to the internet");
		}
		
		void calls3() {
			System.out.println(name + " enables you to make calls and text and it just weights "+ weight+"grs");
		}
	}

