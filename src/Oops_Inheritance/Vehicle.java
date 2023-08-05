package Oops_Inheritance;

public class Vehicle extends Automobile {
	
	public void engine()
	{
		System.out.println("Vehicle Engine method");
	}

	public void brake()
	{
		System.out.println("Vehicle brake method");	
	}
	public void accelerator()
	{
		System.out.println("Vehicle accelerator method");
	}
	@Override
	public void seats() {
	System.out.println("Vehicle seats method");
	}
}

