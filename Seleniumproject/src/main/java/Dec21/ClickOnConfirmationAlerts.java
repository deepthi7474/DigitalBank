package Dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnConfirmationAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://javascript.info/alert-prompt-confirm");
		driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("(//a[@class='toolbar__button toolbar__button_run'])[5]")).click();
		
		Thread.sleep(5000);
		
	String getTextFromConfirmBox = driver.switchTo().alert().getText();
	System.out.println(getTextFromConfirmBox);
		driver.switchTo().alert().accept();
		Thread.sleep(5000); 

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
        driver.findElement(By.xpath("(//a[@class='toolbar__button toolbar__button_run'])[5]")).click();
		
		Thread.sleep(5000);
		String getTextFromConfirmBox2 = driver.switchTo().alert().getText();
		System.out.println(getTextFromConfirmBox2);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
