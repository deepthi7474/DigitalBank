package Dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagteMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to
       
       driver.navigate().to("http://automationpractice.com/index.php");
       
       driver.findElement(By.linkText("Contact us")).click();
       Thread.sleep(5000);
       
       //navigate back

       driver.navigate().back();
       Thread.sleep(5000);
       
       //navigate forward
       
       driver.navigate().forward();
       
       //navigate refresh
       driver.findElement(By.linkText("Contact us")).click();
       
       driver.findElement(By.xpath("//input.[@id='email']")).sendKeys("alugandula.deepthi@gmail.com");
       driver.findElement(By.xpath("//input.[@id='id_order']")).sendKeys("digital cutlet");
       
       Thread.sleep(5000);
       
       driver.navigate().refresh();
       
       
       
       

	}

}
