package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.TestBase;
import pageLayer.HomePage;



public class RegisterTest extends TestBase{
	
	@Test
	public void verifyRegisterTestWithValidDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
//		LoginPage loginpage_obj=new LoginPage(driver);
//		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
//		RegisterPage register_obj=new RegisterPage(driver);
		
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnRegister();
		
/*		logger.info("navigate to Register Page ");
		register_obj.enterFirstName("abc1");
		register_obj.enterLastName("xyz1");
		register_obj.enterEmail("uutt@gmail.com");
		register_obj.enterTelephone("767787656i");
		register_obj.enterPassword("testing@12345");
		register_obj.enterConfirmPassword("testing@12345");
		register_obj.clickOnPrivacyCheckbox();
		register_obj.clickOnContinueBtn();
		logger.info("user register successfully..");
		
		String expected_result="Your Account Has Been Created!";
		
		String actual_result=myaccountpage_obj.gettingAccSuccessMsg();
		Assert.assertEquals(actual_result, expected_result);
		
	}
	
	@Test
	public void verifyRegisterTestWithInvalidEmailDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
		RegisterPage register_obj=new RegisterPage(driver);
		
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnRegister();
		logger.info("navigate to Register Page ");		
		register_obj.enterFirstName("abc1");
		register_obj.enterLastName("xyz1");
		register_obj.enterEmail("uutt@g");
		register_obj.enterTelephone("767787656i");
		register_obj.enterPassword("testing@");
		register_obj.enterConfirmPassword("testing@12345");
		register_obj.clickOnPrivacyCheckbox();
		register_obj.clickOnContinueBtn();
		logger.info("user register successfully..");
		String expected_result="E-Mail Address does not appear to be valid!";
		
		String actual_result=register_obj.gettingEmailError();
		Assert.assertEquals(actual_result, expected_result);
		
	}
	
	@Test
	public void verifyRegisterTestWithInvalidPasswordDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
		RegisterPage register_obj=new RegisterPage(driver);
		
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnRegister();
		logger.info("navigate to Register Page ");		
		register_obj.enterFirstName("abc1");
		register_obj.enterLastName("xyz1");
		register_obj.enterEmail("uutiot@gmail.com");
		register_obj.enterTelephone("767787656i");
		register_obj.enterPassword("testing@");
		register_obj.enterConfirmPassword("testing@12345");
		register_obj.clickOnPrivacyCheckbox();
		register_obj.clickOnContinueBtn();
		logger.info("user register successfully..");
		
		String expected_result="Password confirmation does not match password!";
		
		String actual_result=register_obj.gettingConfirmPassErrorMsg();
		Assert.assertEquals(actual_result, expected_result);
		
	*/}
	
	

}
