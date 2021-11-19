package JavaPractice;

public class userInfo extends userClass {
	
	String userAddress;
	
	userInfo(String name, String mobileNumber,String userAddress){
		super(name, mobileNumber);
		this.userAddress=userAddress;
	}

	public void userDetails() {
		System.out.println(name+" "+mobileNumber+" "+userAddress);
	}
}
