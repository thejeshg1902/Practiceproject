package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage4 {
  
	WebDriver driver;

	public LoginPage4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(id="input-email")
	private WebElement inputemailField;
	
	@FindBy(id="input-password")
	private WebElement inputpasswordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement inputlogbutton;
	
	
	public void enterinputemailField(String EMailAddress)
	{
		inputemailField.sendKeys(EMailAddress);
	}
	
	public void enterinputpasswordField(String Password)
	{
		inputpasswordField.sendKeys(Password);
	}
	
	public void clickOninputlogbutton()
	{
		inputlogbutton.click();
	}
	
	
	
	
}
