package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class SignInPage {
    WebDriver driver = null;
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement loginEmailAddress;
	
	public WebElement getloginEmailAddress()
	{
		return loginEmailAddress;
	}
	public void setemailAddress(String value)
	{
		loginEmailAddress.sendKeys(value);
	}
	
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement loginPassWord;
	
	public WebElement getloginPassWord()
	{
		return loginPassWord;
	}
	public void setpassWord(String value)
	{
		loginPassWord.sendKeys(value);
	}
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signInButton;
	
	public WebElement getsignInButton()
	{
		return signInButton;
	}
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement createEmailAddress1;
	
	public WebElement getcreateEmailAddress1()
	{
		return getcreateEmailAddress1();
	}
	public void setcreateEmailAddress1(String value)
	{
		createEmailAddress1.sendKeys(value);
	}
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement createAnAccount;
	
	public WebElement getcreateAnAccount()
	{
		return createAnAccount;
	}
	
	}
	
 



