package cucumber_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_test1 {
	private static WebDriver driver = null;
	public static void main(String args[]) throws InterruptedException
	{
		driver = new FirefoxDriver();
		 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.store.demoqa.com");
        Thread.sleep(7000);
        driver.quit();
	}

}
