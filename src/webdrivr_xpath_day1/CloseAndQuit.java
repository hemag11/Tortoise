package webdrivr_xpath_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/popuptest2.html");
		
		//driver.close();
		
		driver.quit();
	}

}
