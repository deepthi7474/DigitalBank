package Dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

 public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to
       
       driver.navigate().to("http://automationpractice.com/index.php");
       
       Thread.sleep(5000);
       
       driver.close();
       
       
       
       

	}

}
