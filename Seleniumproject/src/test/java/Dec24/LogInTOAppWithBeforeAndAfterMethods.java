package Dec24;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class LogInTOAppWithBeforeAndAfterMethods {
	WebDriver driver;
  @Test
  public void LogIn() {
	  driver.navigate().to("http://automationpractice.com/index.php");
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deepthi@test.com");
	  driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
	  driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	 
  }
  
  @Test
  public void CreateAccount()
  {
	  
	  driver.navigate().to("http://automationpractice.com/index.php");
	  
	  driver.findElement(By.linkText("Sign in")).click();
  driver.findElement(By.name("email_create")).sendKeys("alugandula.deepthi3@gmail.com");
  
  // driver.findElement(By.className("is_required validate account_input form-control")).sendKeys("alugandula.deepthi@gmail.com");
     
     driver.findElement(By.id("SubmitCreate")).click();
     
     driver.findElement(By.id("id_gender2")).click();
     
     driver.findElement(By.id("customer_firstname")).sendKeys("deepthi");
     
     driver.findElement(By.id("customer_lastname")).sendKeys("alugandula");
    
     
     driver.findElement(By.id("passwd")).sendKeys("123456");
     
     //by visibletext
     
     Select date = new Select(driver.findElement(By.id("days")));
     date.selectByVisibleText("1  ");
     
     //by value
     Select month = new Select(driver.findElement(By.id("months")));
     month.selectByValue("4");
     
     //by index
     Select year = new Select(driver.findElement(By.id("years")));
     year.selectByIndex(15);
     
     driver.findElement(By.id("newsletter")).click();
     
     driver.findElement(By.id("optin")).click();
     
      
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
    
		

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


      
}
