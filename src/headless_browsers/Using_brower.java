package headless_browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Using_brower {
	
	public static void main(String[] args)
	{
		
		FirefoxBinary bin=new FirefoxBinary();
		bin.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
		FirefoxOptions fo=new FirefoxOptions();
		fo.setBinary(bin);
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.nopcommerce.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		
		
	}

}
