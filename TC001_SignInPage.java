package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;

public class TC001_SignInPage extends BaseClass{

	
	@Test(groups= {"Regression"})
	public void verify_SignInPage()
	{
		HomePage hp=new HomePage(driver);
		hp.navigateToHomePage(); 
		hp.clickSignIn();
	}
}
