package basic_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelements_add_url {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "D://dev//selenium//geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://newtours.demoaut.com");
			
			/*String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("Welcome: Mercury Tours")){
				System.out.println("correct");
				
			}
			else
			{
				System.out.println("not correct");
			}*/
			
			WebElement username=driver.findElement(By.name("userName"));
			username.sendKeys("mercury");
			
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			
			
			//System.out.println(title);
			String exptitle="Find a Flight: Mercury Tours: ";
			String acttitle = driver.getTitle();
			
			
			if(exptitle.equals(acttitle))
			{
				System.out.println("test is passed");
			
			}
			else
			{
				System.out.println("test is failed");
			}
			driver.close();
		
	}

}
