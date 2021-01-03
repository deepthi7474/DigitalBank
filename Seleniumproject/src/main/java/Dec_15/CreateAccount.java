package Dec_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("http://automationpractice.com/index.php");
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
      driver.findElement(By.linkText("Sign in")).click();
      
    //  driver.findElement(By.id("email_create")).sendKeys("alugandulad@gmail.com");
      
        driver.findElement(By.name("email_create")).sendKeys("alugandulad@gmail.com");
      
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
        
        driver.findElement(By.id("firstname")).sendKeys("deepthi");
        
        driver.findElement(By.id("lastname")).sendKeys("alugandula");
        
        driver.findElement(By.id("company")).sendKeys("digitalcutlet");
        
        driver.findElement(By.id("address1")).sendKeys("ameerpet,hyderabad");
        
        driver.findElement(By.id("address2")).sendKeys("50001","telagana");
        
        driver.findElement(By.id("city")).sendKeys("hyderabad");
        
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByValue("1");
        
         driver.findElement(By.id("postcode")).sendKeys("56001");
         
         driver.findElement(By.id("id_country")).sendKeys("india");
         
         driver.findElement(By.id("other")).sendKeys("metpalli,street:bhagyanagar");
         
         driver.findElement(By.id("phone")).sendKeys("9030451298");
         
         driver.findElement(By.id("phone_mobile")).sendKeys("9866747486");
         
         driver.findElement(By.id("alias")).sendKeys("jagtail");
         
         driver.findElement(By.id("submitAccount")).click();
         
         
         
         
        
        
        
        
  
    
	}

}
