package WebDriver_Arch;

public class Chromedriver implements Webdriver{
	
	
	public Chromedriver()
	{
		System.out.println("Launch chrome browser");
	}

	@Override
	public void onclick() {
	System.out.println("Chrome onclick Method");
	}

	@Override
	public void sendkeys() {
		System.out.println("Chrome sendkeys Method");
		
	}

	@Override
	public void quit() {
		System.out.println("Chrome quit Method");
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("Chrome findElement Method");
		
	}

}
