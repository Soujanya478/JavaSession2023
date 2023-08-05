package BuilderPattern;

public class Shopping {
	
	public Shopping login()
	{
		System.out.println("User Logged in succesfully");
		return this;
	}
	
	public Shopping login(String Username, String Password) 
	{
		System.out.println("user logged in with " +Username+ " and " +Password);
		return this;
	}
	public Shopping search(String ProductName)
	{
		System.out.println("Search Product "+ProductName);
		return this;
	}
	public Shopping search(String productName, int price)
	{
		System.out.println("Search Product : " +productName+ " : " +price);
		return this;
	}
	public Shopping addToCart(String productName)
	{
		System.out.println("Added to cart : " +productName);
		return this;
	}
		
	public Shopping doPayment(String cc, int cvv)
	{
		System.out.println("Make Payment " +cc +" : " +cvv);
		return this;
	}
	public Shopping generateOrder()
	{
		System.out.println("Order generated successfully" +12345);
		return this;
	}
	public Shopping logout()
	{
		System.out.println("Logout successfully");
		return this;
	}
}
