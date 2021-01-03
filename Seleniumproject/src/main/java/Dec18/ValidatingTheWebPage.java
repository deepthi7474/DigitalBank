package Dec18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("http://automationpractice.com/index.php");
       
       driver.manage().window().maximize();
       
  boolean res = driver.findElement(By.xpath("//input[@id='search_query_top']")).isDisplayed();
    if(res==true)
    {
    	System.out.println("automation practice website opened successfully");
    	
    }
    else
    {
    	System.out.println("automation practice website not opended");
    }
	}

}
