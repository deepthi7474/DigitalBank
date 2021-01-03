package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {

WebDriver driver = null;
	
	public CreateAnAccountPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath ="//input[@id='id_gender1']")
	private WebElement genderMr;
	
	public WebElement getgenderMr()
	{
		return genderMr;
	}
    
	@FindBy(xpath ="//input[@id='id_gender2']")
	private WebElement genderMrs;
	
	public WebElement getgenderMrs()
	{
		return genderMrs;
	}

	@FindBy(xpath ="//input[@id='customer_firstname']")
	private WebElement firstName;
	
	public WebElement getfirstName()
	{
		return firstName;
		
	}
	public void setfirstName(String value)
	{
		firstName.sendKeys(value);
		
	}

	@FindBy(xpath ="//input[@id='customer_lastname']")
	private WebElement lastName;
	
	public WebElement getlastName()
	{
		return lastName;
		
	}
	public void setlastName(String value)
	{
		lastName.sendKeys(value);
		
	}

	@FindBy(xpath ="//input[@id='email']")
	private WebElement email;
	
	public WebElement getemail()
	{
		return email;
		
	}
	public void setemail(String value)
	{
		email.sendKeys(value);
		
	}
	
	@FindBy(xpath ="//input[@id='passwd']")
	private WebElement passWord;
	
	public WebElement getpassWord()
	{
		return passWord;
		
	}
	public void setpassWord(String value)
	{
		passWord.sendKeys(value);
		
	}
	@FindBy(xpath ="//select[@id='days']")
	private WebElement date;
	
	public WebElement getdate()
	{
		return date;
		
	}
	public void setdate(String value)
	{
		date.sendKeys(value);
		}
	
	@FindBy(xpath ="//select[@id='months']")
	private WebElement month;
	
	public WebElement getMonth()
	{
		return month;
		
	}
	public void setmonth(String value)
	{
		month.sendKeys(value);
		
	}
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement year;
	
	public WebElement getYear()
	{
		return year;
		
	}
	public void setyear(String value)
	{
		year.sendKeys(value);
	}
	
	
	@FindBy(xpath="//input[@id='newsletter']")
	private WebElement checkBox;
	
	public WebElement getCheckBox()
	{
		return checkBox;
	}

	@FindBy(xpath="//input[@id='optin']")
	private WebElement checkBox1;
	
	public WebElement getCheckBox1()
	{
		return checkBox1;
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstName1;
	
	public WebElement getFirstName1()
	{
		return firstName1;
		
	}
	public void setfirstName1(String value)
	{
		firstName1.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName1;
	
	public WebElement getLastName1()
	{
		return lastName1;
		
	}
	public void setlastName1(String value)
	{
		lastName1.sendKeys(value);
	}
	
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement companyName;
	
	public WebElement getCompanyName()
	{
		return companyName;
		
	}
	public void setcompanyName(String value)
	{
		companyName.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	public WebElement getAddress1()
	{
		return address1;
		
	}
	public void setaddress1(String value)
	{
		address1.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;
	
	public WebElement getAddress2()
	{
		return address2;
		
	}
	public void setaddress2(String value)
	{
		address2.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityName;
	
	public WebElement getCityName()
	{
		return cityName;
		
	}
	public void setcityName(String value)
	{
		cityName.sendKeys(value);
	}
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement stateName;
	
	public WebElement getStateName()
	{
		return stateName;
		
	}
	public void setstateName(String value)
	{
		stateName.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postalCode;
	
	public WebElement getpostalCode()
	{
		return postalCode;
		
	}
	public void setpostalCode(String value)
	{
		postalCode.sendKeys(value);
	}
	
	@FindBy(xpath="//select[@id='id_country']")
	private WebElement country;
	
	public WebElement getCountry()
	{
		return country;
		
	}
	public void setcountry(String value)
	{
		country.sendKeys(value);
	}
	
	


	
	
	
	
	
	
	
}
