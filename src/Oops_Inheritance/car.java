package Oops_Inheritance;

public class car extends Vehicle{
	
	public void start()
	{
		System.out.println("car start Method");
	}
		
	public void stop()
	{
		System.out.println("Car Stop method");

	}
	public void refuel()
	{
		System.out.println("Car refuel Method");
	}
	
	public static void wheels()
	{
		System.out.println("car wheels Method");
	}
	@Override
	public void accelerator()
	{
		System.out.println("Car accelerator Method");
	}
	
	public Object gear()
	{
		System.out.println("Car vehicle method");
		return new Object();
	}
	
	public final void musicSystem() // Final method cannot be overriden
	{
		System.out.println("Car Music System Method");
	}
	
	public static final void power()
	{
		System.out.println("Car power method");
	}
	
	private static void testing()
	{
		System.out.println("car private testing method");
	}

}
