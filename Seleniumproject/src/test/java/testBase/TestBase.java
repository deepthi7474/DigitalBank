package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ContactUsPage;
import Pages.CreateAnAccountPage;
import Pages.HomePage;
import Pages.SignInPage;

public class TestBase {
	public static WebDriver driver;

	protected static ContactUsPage contactUsPageObj;
	protected static CreateAnAccountPage createAnAccountPageObj;
	protected static HomePage homePageObj;
	protected static SignInPage signInPageObj;

	@BeforeTest(groups = { "HomePage", "ContactUsPage", "SignInPage", "CreateAnAccountPage","Regression" ,"smoke"})
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Test\\Seleniumproject\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		contactUsPageObj = new ContactUsPage(driver);
		createAnAccountPageObj = new CreateAnAccountPage(driver);
		homePageObj = new HomePage(driver);
		signInPageObj = new SignInPage(driver);

	}

	@AfterTest(groups = { "HomePage", "ContactUsPage", "SignInPage", "CreateAnAccountPage","Regression","smoke" })

	public void afterTest() {
		driver.close();
	}

	@BeforeMethod

	public void beforeMethod() {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

}
