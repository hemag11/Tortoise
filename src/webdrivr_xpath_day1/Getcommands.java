package webdrivr_xpath_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"
				+ "/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/"
				+ "tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/"
				+ "tbody[1]/tr[2]/td[3]/form[1]/table[1]/tbody[1]/tr[1]"
				+ "/td[1]/font[1]/b[1]")).getText();
				System.out.println(text);
				driver.close();
		
	}

}
