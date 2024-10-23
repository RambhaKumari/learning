package testCases;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import pageObject.HomePage;
import pageObject.SignInWithEmail;

public class TC002_SignInWithEmail extends BaseClass
{
	@Test(groups= {"Sanity","Regression"})
	
	public void verify_SignInWithEmail()
	{
		HomePage hp=new HomePage(driver);
		hp.navigateToHomePage(); 
		hp.clickSignIn();
		
		SignInWithEmail se=new SignInWithEmail(driver);
		se.enterEmail("8867436050");
		se.clickContinue1();
	}
}
