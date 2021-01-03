package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver)
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
 
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search;
	public WebElement getSearch()
	{
		return search;
	}

   public void setSearch(String value)
   {
	   search.sendKeys(value);
   }
   
    @FindBy(xpath="//button[@name='submit_search']")
	private WebElement searchButton;
	public WebElement getSearchButton()
	{
		return searchButton;
	}


}
