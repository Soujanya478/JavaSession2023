package Oops_AbstractClass;

public abstract class page {
	
	int max_login = 3;
	
	
	public page()
	{
		this(10);
		System.out.println("Default Constructor --- Page class");
	}
	
	public page(int i) {
		System.out.println("single parameterized constructor " +i + " Page Class");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void defaulttimeout() {
		System.out.println("Default time out -- 15 sec -- Page Class ");
	}
	 
	public void displayFooters() {
		System.out.println("Display Footers --- Page Class");
	}
	
	public static void displayDate() 
	{
		System.out.println("displayDate --- Page Class");
	}
	
	public final void displayLabel()
	{
		System.out.println("displayLabel --- Page Class");
	}

}
