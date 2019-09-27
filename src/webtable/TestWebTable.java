package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebTable {

	public static void main(String[] args) {
		
		//open the website
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
