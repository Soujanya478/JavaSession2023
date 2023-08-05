package WebDriver_Arch;

public class safariDriver implements Webdriver{
	
	public safariDriver()
	{
		System.out.println("Launch safari browser");
	}

	@Override
	public void onclick() {
	System.out.println("firefox onclick Method");
	}

	@Override
	public void sendkeys() {
		System.out.println("firefox sendkeys Method");
		
	}

	@Override
	public void quit() {
		System.out.println("firefox quit Method");
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("firefox findElement Method");
		
	}
}
