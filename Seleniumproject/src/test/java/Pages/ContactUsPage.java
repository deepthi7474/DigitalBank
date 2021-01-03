package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver = null;
	
	public ContactUsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Contact us")
     private WebElement contactUsLink;
	
	public WebElement getcontactUsLink()
	{
		return contactUsLink;
	}
	
	@FindBy(linkText = "Sign in")
	private WebElement signInLink;
	
	public WebElement getsignInLink()
	{
		return signInLink;
	}
    
	@FindBy(xpath ="//select[@id='id_contact']")
	private WebElement subjectHeading;
	
	public WebElement getsubjectHeading()
	{
		return subjectHeading;
		
	}
	public void setsubjectHeading(String value)
	{
		subjectHeading.sendKeys(value);
		
	}
	
	@FindBy(xpath ="//input[@id = 'email']")
	private WebElement emailAddress;
	
	public WebElement getemailAddress()
	{
		return emailAddress;
		
	}
	public void setemailAddress(String value)
	{
		emailAddress.sendKeys(value);
		
	}
	

	@FindBy(xpath = "//input[@id = 'id_order']")
	private WebElement orderReference;
	
	public WebElement getorderReference()
	{
		return orderReference;
	}
	public void setorderReference(String value)
	{
		orderReference.sendKeys(value);
	}
	
	@FindBy(xpath ="//input[@id = 'fileUpload']")
	
	private WebElement attachFile;
	
	public WebElement getattachFile()
	{
		return attachFile;
	}
	public void setattachFile(String value)
	{
		attachFile.sendKeys(value);
	}
	
	 @FindBy(xpath ="//button[@id='submitMessage']")
	
	private WebElement sendFile;
	
	public WebElement getsendFile()
	{
		return sendFile;
	}
	public void setsendFile(String value)
	{
		sendFile.sendKeys(value);
	}
	
	
	
	}
	
	
	
	

