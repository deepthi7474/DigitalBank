package Dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();

	}

}
