package basic_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxscripts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selinium_workspace//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://learn-automation.com");
		
		//driver.quit();
	}

}
