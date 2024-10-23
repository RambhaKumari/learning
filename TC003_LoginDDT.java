package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignInWithEmail;
import pageObject.SignInWithPassword;

public class TC003_LoginDDT extends BaseClass{
@Test
	public void verify_LoginDDT()
	{
		HomePage hp=new HomePage(driver);
		hp.navigateToHomePage(); 
		hp.clickSignIn();
		
		SignInWithEmail se=new SignInWithEmail(driver);
		se.enterEmail("8867436050");
		se.clickContinue1();
		
		SignInWithPassword sp=new SignInWithPassword(driver);
		hp.enterPassword("Rambo@0123");
		hp.clickContinue2();
	}
	
}
