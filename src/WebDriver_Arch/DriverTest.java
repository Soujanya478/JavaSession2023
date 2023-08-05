package WebDriver_Arch;

public class DriverTest {

	public static void main(String[] args) {
		
		//Chromedriver driver = new Chromedriver();
		
		String browser ="firefox";
		Webdriver driver = null;
		
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new Chromedriver();
			break;
		case "firefox":
			driver = new firefoxDriver();
			break;
		case "safari":
			driver = new safariDriver();
			break;

		default:
			System.out.println("Please Pass the right browser..."+browser);
			break;
		}
		
		driver.findElement("emailID");
		driver.onclick();
		driver.sendkeys();
		driver.quit();

	}

}
