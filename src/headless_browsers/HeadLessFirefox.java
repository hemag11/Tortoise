package headless_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		FirefoxOptions options= new FirefoxOptions();
		options.setHeadless(true);
				
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.nopcommerce.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		
		
	}

}
