package headless_browsers;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_unithtml {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("http://demo.nopcommerce.com/");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("current url of the page:"+driver.getCurrentUrl());
	}

}
