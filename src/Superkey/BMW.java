package Superkey;

public class BMW extends car {
	
	int min_speed = 200;
	
	public void displaySpeed()
	{
		System.out.println(min_speed); // This/super should be the first statement
		System.out.println(super.min_speed); //this and super cannot be together. 
	}
	
	public void speed()
	{
		System.out.println("BMW Speed"); //super can call parent method, variables
		super.speed();                   //super can call parent constructor and it should be the first statement
		System.out.println(super.min_speed); // static methods can be called with super keyword  
	}

}
