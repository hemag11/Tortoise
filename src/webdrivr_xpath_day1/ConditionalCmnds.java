package webdrivr_xpath_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCmnds {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
	WebElement	email=driver.findElement(By.xpath("//input[@name='userName']"));
	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	
	if(email.isDisplayed() && email.isEnabled())
	{
		email.sendKeys("mercury");
	}
	if(pass.isDisplayed() && pass.isEnabled())
	{
		pass.sendKeys("mercury");
	}
	driver.findElement(By.name("login")).click();
	

	}

}
