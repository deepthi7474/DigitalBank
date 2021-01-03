package Dec29TCs;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class HomePageTestCasesWithEnableDisable extends TestBase {
	@Test(priority = 1, enabled = false)
	public void searchAvalue() {
		homePageObj.setSearch("DRESSES");
		homePageObj.getSearchButton().click();
	}

	@Test(priority = 3)
	public void verifycontactUsLink() {
		homePageObj.getcontactUsLink().click();
		if (contactUsPageObj.getemailAddress().isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("contact us page is displayed");
		} else {
			System.out.println("contact us page is not displayed");
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2, enabled = false)
	public void verifySignInLink() {
		homePageObj.getsignInLink().click();
		if (signInPageObj.getloginEmailAddress().isEnabled()) {
			System.out.println("sign in page is enabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("sign in page is not enabled");
			Assert.assertTrue(false);

		}
	}

	@Test(priority = 8)
	public void logintoApp() {
		homePageObj.getsignInLink().click();
		signInPageObj.setemailAddress("deepthi2@test.com");
		signInPageObj.setpassWord("12345");
		signInPageObj.getsignInButton();
	}

	@Test(priority = 7, enabled = false)
	public void verifycreateAnaccount() {
		homePageObj.getsignInLink().click();
		signInPageObj.setcreateEmailAddress1("deepthi3@test.com");
		signInPageObj.getcreateAnAccount();
	}

	@Test(priority = 4)
	public void verifyContactUsPage() {
		homePageObj.getcontactUsLink().click();
		contactUsPageObj.setemailAddress("deepthi1@test.com");
	}

	@Test(priority = 5, enabled = false)
	public void verifyContactUsPage2() {
		homePageObj.getcontactUsLink().click();
		contactUsPageObj.setemailAddress("deepthi1@test.com");
		contactUsPageObj.setsubjectHeading("abcd");
		contactUsPageObj.setorderReference("1234");

	}

	@Test(priority = 6)
	public void createAnAccount() {

		homePageObj.getsignInLink().click();
		signInPageObj.setcreateEmailAddress1("deepthi1@test.com");
		signInPageObj.getcreateAnAccount().click();

		createAnAccountPageObj.getgenderMr().click();
		createAnAccountPageObj.getgenderMrs().click();

		createAnAccountPageObj.setfirstName("deepthi");
		createAnAccountPageObj.setlastName("alugandula");

		createAnAccountPageObj.setemail("alugandula.deepthi@gmail.com");
		createAnAccountPageObj.setpassWord("123456");

		createAnAccountPageObj.setdate("3");
		createAnAccountPageObj.setmonth("april");
		createAnAccountPageObj.setyear("2000");
	}
}
