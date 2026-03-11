package stepdefination3;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory3.DriverFactory3;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page3.LoginPage3;
import page3.LoginPage4;
import page3.RegisterPage;
import utils3.ConfigReader3;

public class Paralelletest {
	
	//Update comment
	
	WebDriver driver;
	LoginPage3 loginpage;
	private RegisterPage registerPage;
	LoginPage4 login;
	
	
    // ---------------- LOGIN STEPS ----------------

	@Given("User enter valid Username {string}")
	
	public void user_enter_valid_username(String Username) throws InterruptedException {
		driver = DriverFactory3.getDriver();
          System.out.println(" launch in chrome broser");
        if (driver == null) {
            throw new RuntimeException(
                "Driver not initialized. Check @login tag or Hook execution."
            );

        }
      
        driver.get(ConfigReader3.getProp().getProperty("login.url"));

        loginpage = new LoginPage3(driver);
        loginpage.enterUserNameField(Username);	
        Thread.sleep(2000);
		
		
	} 
	 
	
	@When("User enter valid Password {string}")
	public void user_enter_valid_password(String Password) throws InterruptedException {
		loginpage.enterUserPasswordField(Password);
		  Thread.sleep(2000);
	}
	
	@Then("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginpage.clickOnSignButton();
		  Thread.sleep(2000);
		  
	}
	
	// // REGISTER

	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() throws InterruptedException {
		System.out.println(" launch in firefox broser");
		driver = DriverFactory3.getDriver();

        if (driver == null) {
            throw new RuntimeException(
                "Driver not initialized. Check @register tag or Hook execution."
            );
        }

        driver.get(ConfigReader3.getProp().getProperty("register.url"));

        registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
	}
	
	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) throws InterruptedException {
	  Map<String,String> dataMap =dataTable.asMap(String.class,String.class);
	  
	  
	  registerPage.enterFirstName(dataMap.get("First Name"));
	  Thread.sleep(1000);
	  registerPage.enterLastName(dataMap.get("Last Name"));
	  Thread.sleep(2000);
	  registerPage.enterEmailAddress(dataMap.get("E-Mail"));
	  Thread.sleep(2000);
	  registerPage.enterTelephoneNumber(dataMap.get("Telephone"));
	  Thread.sleep(2000);
	  registerPage.enterPassword(dataMap.get("Password"));
	  Thread.sleep(2000);
	  registerPage.enterConfirmPassword(dataMap.get("Password Confirm"));
	  Thread.sleep(2000);
	}

	@And("User selects Privacy Policy")
	public void user_selects_privacy_policy() throws InterruptedException {
		registerPage.selectPrivacyPolicy();  
		  Thread.sleep(2000);
	}

	@And("User clicks on Continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		registerPage.clickonContinueButton(); 
		  Thread.sleep(2000);
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() throws InterruptedException { 
		 System.out.println("User registered successfully");
		  Thread.sleep(2000);
	}

	// @login1

	
	@Given("User enter valid EMailAddress {string}")
	public void user_enter_valid_emailaddress(String EMailAddress) throws InterruptedException {
		driver = DriverFactory3.getDriver();
          System.out.println(" launch in edge broser");
        if (driver == null) {
            throw new RuntimeException(
                "Driver not initialized. Check @login1 tag or Hook execution.");
            }
      
        driver.get(ConfigReader3.getProp().getProperty("login1.url"));

        login = new LoginPage4(driver);
        login.enterinputemailField(EMailAddress);
        Thread.sleep(2000);
	
}
	@And("User entered valid Password {string}")
	public void user_entered_valid_password(String Password) {
		login.enterinputpasswordField(Password); 
	}

	@Then("User click on login Button")
	public void user_click_on_login_button() {
		login.clickOninputlogbutton();  
	}
	
}