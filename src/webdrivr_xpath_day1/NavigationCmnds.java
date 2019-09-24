package webdrivr_xpath_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCmnds {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https:/www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		//driver.navigate().refresh();
		
		driver.close();
	}

}
