package Oops_AbstractClass;

public class pageLogin extends page{
	
	public pageLogin()
	{
		System.out.println("default constructor -- pageLogin Class");
	}
	
	public pageLogin(int i) {
		System.out.println("single parameterized constructor " +i + " PageLogin Class");
	}

	@Override
	public void title() {
		System.out.println("Login page title --- pageLogin");
	}

	@Override
	public void url() {
		System.out.println("Login URL ---URL Login");
		
	}
	@Override
	public void defaulttimeout() {
		System.out.println("Default time out -- 3 sec -- Page Login Class ");
	}
	
	public void doLogin()
	{
		System.out.println("Login to the app -- page Login class");
	}
	
	
	public static void displayDate() 
	{
		System.out.println("displayDate --- Page Login Class");
	}


}
