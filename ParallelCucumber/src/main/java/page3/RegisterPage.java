package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    
    //constructor
	    public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    //locators

	    @FindBy(id = "input-firstname")
	    private WebElement firstName;

	    @FindBy(id = "input-lastname")
	    private WebElement lastName;

	    @FindBy(id = "input-email")
	    private WebElement email;

	    @FindBy(id = "input-telephone")
	    private WebElement telephone;

	    @FindBy(id = "input-password")
	    private WebElement password;

	    @FindBy(id = "input-confirm")
	    private WebElement confirmPassword;

	    @FindBy(name = "agree")
	    private WebElement privacyPolicy;
	    
	    @FindBy(xpath ="//input[@type='submit']")
	    private WebElement continueBtn;

	    // ===== Page Actions =====

	    public void enterFirstName(String firstnameText)
	    {
	    	firstName.sendKeys(firstnameText);
	    }
	    
	    public void enterLastName(String lastnameText)
	    {
	    	lastName	.sendKeys(lastnameText);
	    }
	    
	    public void enterEmailAddress(String emailText)
	    {
	    	email.sendKeys("emailText");
	    }
	    
	    public void enterTelephoneNumber(String telephoneText)
	    {
	    	telephone.sendKeys(telephoneText);
	    }
	    
	    public void enteredPassword(String passwordText)
	    {
	    	password.sendKeys(passwordText);
	    }
	    
	    public void enterConfirmPassword(String ConfirmPassword)
	    {
	    	confirmPassword.sendKeys(ConfirmPassword);
	    }
	  
	    public void selectPrivacyPolicy()
	    {
	    	privacyPolicy.click();
	    }
	    
	    public void clickonContinueButton()
	    {
	    	continueBtn.click();
	    }
	    
	    
	    
	    public void enterPassword(String pwd) {
	        password.sendKeys(pwd);
	        confirmPassword.sendKeys(pwd);
	    }

	    public void submitForm() {
	        privacyPolicy.click();
	        continueBtn.click();
	    }
	}

