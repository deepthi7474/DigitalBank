package Dec29TCs;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class HomePageTestCases extends TestBase {
  @Test
  public void searchAvalue() {
	  homePageObj.setSearch("DRESSES");
	  homePageObj.getSearchButton().click();
  }
  
  @Test 
  public void verifycontactUsLink()
  {
	  homePageObj.getcontactUsLink().click();
	  if(contactUsPageObj.getemailAddress().isDisplayed())
	  {
		  Assert.assertTrue(true);
		  System.out.println("contact us page is displayed");
	  }
	  else
	  {
		  System.out.println("contact us page is not displayed");
		  Assert.assertTrue(false);
	  }  
	  
  }

  
  @Test
  public void verifySignInLink()
  {
	  homePageObj.getsignInLink().click();
	  if(signInPageObj.getloginEmailAddress().isEnabled())
	  {
		  System.out.println("sign in page is enabled");
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  System.out.println("sign in page is not enabled");
		  Assert.assertTrue(false);
		  
	  }
  }
  
}

