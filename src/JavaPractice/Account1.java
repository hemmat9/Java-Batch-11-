package JavaPractice;

public class Account1 {

	private String userName;
	private String password;
	private String address;
	private String name;
	private double balance=100000;
	
	public void setUserName(String accountUserName) {
		if(accountUserName.length()<16) {
			userName=accountUserName;
		}else {
			System.out.println("Too lenghty userName");
		}
	}
	public void setPassword(String accountPassword) {
		if (accountPassword.length()<12) {
			password=accountPassword;
		}else {
			System.out.println("too long password");
		}
	}
	
		public void getBalance (String accountUserName, String accountPassword) {
			if (userName.equals(accountUserName)&& password.equals(accountPassword)) {
				System.out.println(balance);
			} else {
				System.out.println("Username or Password is wrong");
			}
		}
		
		
		
		
	}

