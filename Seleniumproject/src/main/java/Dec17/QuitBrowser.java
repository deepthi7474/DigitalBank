package Dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowser {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
      driver.get("http://automationpractice.com/index.php");
       
       driver.manage().window().maximize();
       
       Thread.sleep(5000);
     
      
      driver.quit();

	}

}
