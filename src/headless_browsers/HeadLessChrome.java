package headless_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D://dev//selinium_workspace//chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.nopcommerce.com");
	
		System.out.println("title of the page:"+driver.getTitle());
	
	
	
	
	}
	
	
	

}
