package Oops_AbstractClass;

public class LoginTest {

	public static void main(String[] args) {
	
		pageLogin lp = new pageLogin(5);
		lp.title();
		lp.url();
		lp.defaulttimeout();
		lp.doLogin();
		lp.displayFooters();
		lp.displayLabel(); //Final Method
		pageLogin.displayDate();  //static method
		lp.max_login=5;
		
		System.out.println("----------");
		
		page p = new pageLogin();
		p.title();
		p.defaulttimeout();
		p.displayFooters();
		p.url(); 
		page.displayDate();
		p.max_login=8;
	}
	
	

}
