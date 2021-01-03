package Dec29TCs;

import org.testng.annotations.Test;

import testBase.TestBase;

public class ContactUsPageTestcases extends TestBase 
{
  @Test
  public void verifyContactUsPage() 
  {
	  homePageObj.getcontactUsLink().click();
	  contactUsPageObj.setemailAddress("deepthi1@test.com");
  }
  @Test
  public void verifyContactUsPage2()
  {
	  homePageObj.getcontactUsLink().click();
	  contactUsPageObj.setemailAddress("deepthi1@test.com");
	  contactUsPageObj.setsubjectHeading("abcd");
	  contactUsPageObj.setorderReference("1234");
	  
  }
}

