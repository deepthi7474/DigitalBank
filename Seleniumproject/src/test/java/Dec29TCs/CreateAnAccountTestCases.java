package Dec29TCs;

import org.testng.annotations.Test;

import testBase.TestBase;

public class CreateAnAccountTestCases extends TestBase {
	@Test
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
