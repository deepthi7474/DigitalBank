package Dec17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
      driver.get("http://automationpractice.com/index.php");
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
       driver.findElement(By.linkText("Contact us")).click();
       
       //get page url
       
        String url = driver.getCurrentUrl();
          System.out.println(url);
      
      //get page Title
      
       String pageTitle = driver.getTitle();
       System.out.println(pageTitle);
      
      //get page source
      
      String pageSource = driver.getPageSource();
      System.out.println(pageSource);
      
      
      

	}

}
