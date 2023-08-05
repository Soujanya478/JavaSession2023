package BuilderPattern;

public class shopTest {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
		shop.login("Sam","Same@123")
						.search("shirt")
							.addToCart("shirt")
								  .doPayment("1234466", 987)
								 	  .logout();

	}

}
