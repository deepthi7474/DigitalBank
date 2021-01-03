package Dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	WebElement womenLink = driver.findElement(By.xpath("//a[text()='Women']"));
		
	Actions action = new Actions(driver);
	action.moveToElement( womenLink).build().perform();
	
	driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();

	}

}
