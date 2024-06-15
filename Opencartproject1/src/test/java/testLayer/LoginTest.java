package testLayer;

import org.testng.annotations.Test;

import Utility.TestBase;
import pageLayer.HomePage;

public class LoginTest extends TestBase{
	
	@Test
	public void verifyLoginTestWithValidDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
		homepage_obj.clickOnMyAccount();
	//	homepage_obj.clickOnLogin();
		
	}
	}

