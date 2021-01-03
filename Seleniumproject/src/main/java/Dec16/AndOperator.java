package Dec16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("http://automationpractice.com");
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
       driver.findElement(By.linkText("Sign in")).click();
       
       driver.findElement(By.name("email_create")).sendKeys("alugandulad1@gmail.com");
       
       driver.findElement(By.id("SubmitCreate")).click();
       
       driver.findElement(By.xpath("//input[@name='id_gender' and @id='id_gender1']")).click();

	
}
}