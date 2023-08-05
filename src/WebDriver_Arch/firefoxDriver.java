package WebDriver_Arch;

public class firefoxDriver implements Webdriver {
	
	public firefoxDriver()
	{
		System.out.println("Launch firefox browser");
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
