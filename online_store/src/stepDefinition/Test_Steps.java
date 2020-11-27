package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;






import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Test_Steps {
	public static WebDriver driver;
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		  driver = new FirefoxDriver();
	      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://api.checklist.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(6000);
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(List<Credentials>  usercredentials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   // throw new PendingException();
		for (Credentials credentials : usercredentials) {		
			

		driver.findElement(By.id("email")).sendKeys(credentials.getUsername());
		driver.findElement(By.name("j_password")).sendKeys(credentials.getPassword());
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/button")).click();
		//Assert.assertEquals("Courses",driver.findElement(By.xpath("//div/ul/li/a")).getText());
	    //Assert.assertTrue(isElementPresent(By.xpath("//div/ul/li/a")));
		Thread.sleep(5000);
		
	    driver.close();
	  
		/*WebElement logout=driver.findElement(By.xpath("/html/body/div[2]/div/md-toolbar/div/div[2]/md-menu-bar/md-menu/div[2]"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", logout);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/md-toolbar/div/div[2]/md-menu-bar/md-menu/div[1]/md-menu-content/md-menu-item[8]/button")).click();
		Thread.sleep(3000);*/
		//driver.quit();
	}
		
		//driver.quit();
		
		
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.quit();
		
	}


@Then("^Message displayed Login unSuccessfully$")
public void message_displayed_Login_unSuccessfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
    //throw new PendingException();

}

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
	
/*@When("^User LogOut from the Application$")
public void user_LogOut_from_the_Application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("hbx-3-5-auto-qa-1.myhbx.org");
     //throw new PendingException();
}

@Then("^Message displayed LogOut Successfully$")
public void message_displayed_LogOut_Successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(7000);
	 driver.quit();
    //throw new PendingException();
   
}

@When("^Login$")
public void login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^Login successful$")
public void login_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}*/




	

}
