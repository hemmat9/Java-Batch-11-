package JavaPractice;

public class Task1 {

	//Create a method that will take a String as a parameter and returns reversed String. 
	//Method should be available to all classes within your project and accessible by class name.
	
	
	private static  String reverseStr (String str) {
		
		return new StringBuilder(str).reverse().toString();
		
		
	}
		public static void main(String[] args) {
			
			Task1 abc = new Task1();
			System.out.println(abc.reverseStr("Ghulam").toString());
			
			
			
			
		}
		
		}
	
	

	

