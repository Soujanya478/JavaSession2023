package Oops_Inheritance;

public class BMW extends car{ //BMW is extending car
	
	@Override // its a best practice to write override annotation for override methods
	public void start()
	{
		System.out.println("BMW start Method");
	}
	
	
	@Override
	public void engine()
	{
		System.out.println("BMW engine Method");
	}
	
	@Override
	public BMW gear() //allowed bcozz all classes are child class of object classes
	{
		System.out.println("BMW gear class");
		return new BMW();
	}
	//Individual Method
	public void autoParking()
	{
		System.out.println("BMW autoparking method");
	}
		//Method hiding
	public static void wheels() //static method can be inherited but not overriden
	{
		System.out.println("BMW Wheels method");
	}
	
	//public void musicSystem() final method cannot be declared
	//{
    //System.out.println("BMW musicSystem method");
	//}
}
