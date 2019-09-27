package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarTable {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.trivago.in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='calendar-button-wrapper calendar-button-wrapper--checkin']//span[@class='flex']")).click();
		
		Select y = new Select(driver.findElement(By.xpath("//span[contains(text(),'October 2019')]")));
		y.selectByVisibleText("2019");
		
		for(int i=6;i>1;i--)
		{
			driver.findElement(By.xpath("//span[@class='icon-ic cal-btn-ic icon-rtl icon-flip']")).click();
			
			String m = driver.findElement(By.xpath("//span[contains(text(),'December 2019')]")).getText();
			if(m.equals("December2019"))
			{
				driver.findElement(By.linkText("10")).click();
				break;
			}
		}
		
	}

}
