package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class TestAmazonPage extends BaseClass {

	
	
   @Test(groups="Sanity")
   public void verify_TestAmazonPage()
   {
	   HomePage hp = new HomePage(driver);
       hp.navigateToHomePage();  //Launch the application
       hp.clickSignIn();
       
       
   }  
   }


