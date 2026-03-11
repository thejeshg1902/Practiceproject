package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {
	WebDriver driver;

	public LoginPage3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="txtLoginEmailId")
		private WebElement emailField;
		
		@FindBy(id="txtLoginPassword")
		private WebElement passwordfield;
		
		@FindBy(id="submitLogin")
		private WebElement Signbutton;
		
		
		public void enterUserNameField(String Username)
		{
			emailField.sendKeys(Username);
		}
		
		public void enterUserPasswordField(String Password)
		{
			passwordfield.sendKeys(Password);
		}
		
		public void clickOnSignButton()
		{
			Signbutton.click();
			
			
		}
}
