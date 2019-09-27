package seleniumwebdriver_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_basictests {
public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver", "D:\\dev\\selinium_workspace\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("http://google.com");
	driver.quit();
	

    }

}


