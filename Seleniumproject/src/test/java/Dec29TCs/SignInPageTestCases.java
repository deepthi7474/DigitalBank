package Dec29TCs;

import org.testng.annotations.Test;

import testBase.TestBase;

public class SignInPageTestCases extends TestBase {
  @Test
  public void logintoApp() 
  {
	  homePageObj.getsignInLink().click();
	  signInPageObj.setemailAddress("deepthi2@test.com");
	  signInPageObj.setpassWord("12345");
	  signInPageObj.getsignInButton();
  }
  @Test
  public void verifycreateAnaccount()
  {
	  homePageObj.getsignInLink().click();
	  signInPageObj.setcreateEmailAddress1("deepthi3@test.com");
	  signInPageObj.getcreateAnAccount();
  }
}
