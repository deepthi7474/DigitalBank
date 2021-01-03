package Dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://javascript.info/alert-prompt-confirm");
		
		driver.manage().window().maximize();
		 
		driver.findElement( By.xpath("(//a[@class='toolbar__button toolbar__button_run' ])[1]")).click();

		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
	}


		
			

}

