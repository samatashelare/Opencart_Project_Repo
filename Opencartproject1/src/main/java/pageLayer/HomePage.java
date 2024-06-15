package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//------------------obj repo -------------------
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myacc_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register_link;
	
//----------------action method-------------

	
	public void clickOnMyAccount()
	{
		myacc_link.click();
	}
	
	public void clickOnLogin()
	{
		login_link.click();
	}
	public void clickOnRegister()
	{
		register_link.click();
	}

}
