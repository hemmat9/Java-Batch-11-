package JavaPractice;

public class StringIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "Farhad";
		String Password = "Far@123";
		if (Name.equals("Farhad")) {
			System.out.println("Correct Name entered");
		} else if (!Name.equals("Farhad")) {
			System.out.println("I don't know you!");
		}
		if (Password.equals("Far@123")) {
			System.out.println("The Password is accepted.");
		} else if (!Password.equals("Far@123")) {
			System.out.println("Wrong Password.");

		}
	}

}
