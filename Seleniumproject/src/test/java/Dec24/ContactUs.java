package Dec24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testBase.TestBase;

public class ContactUs extends TestBase {

  @Test
  public void contactUs() {
	  driver.navigate().to("http://automationpractice.com/index.php");
	  driver.findElement(By.linkText("Contact us")).click();
	 
  }
  @Test
  public void signIn() {
	  driver.navigate().to("http://automationpractice.com/index.php");
	  driver.findElement(By.linkText("Sign in")).click();
	 
  }

}

