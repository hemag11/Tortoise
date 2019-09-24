package seleniumwebdriver_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver_give {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up")){
			System.out.println("correct");
			
		}
		else
		{
			System.out.println("not correct");
		}
		
		
		
		/*System.setProperty("webdriver.chrome.driver","D://dev//selinium_workspace//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in");*/
		
		
		
		
		
		
		
	}

}
