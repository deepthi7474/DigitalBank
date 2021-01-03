package Dec_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSite {



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedrive.exe");                                                                                                                                                                                                                   
	     
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
}
