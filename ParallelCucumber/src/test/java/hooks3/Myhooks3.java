package hooks3;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory3.DriverFactory3;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils3.ConfigReader3;

public class Myhooks3 {
	
	 Properties prop;
	
	    @Before
	    public void setUp(Scenario scenario) {
	    	
	    	System.out.println(">>> BEFORE HOOK EXECUTED <<<");
	        System.out.println("Scenario name: " + scenario.getName());
	        System.out.println("Tags: " + scenario.getSourceTagNames());

	        prop = ConfigReader3.getProp();

	        if (scenario.getSourceTagNames().contains("@login")) {
	            DriverFactory3.initDriver(prop.getProperty("login.browser"));
	        }
	        else if (scenario.getSourceTagNames().contains("@register")) {
	            DriverFactory3.initDriver(prop.getProperty("register.browser"));
	        }
	        
	        else if (scenario.getSourceTagNames().contains("@login1")) {
	            DriverFactory3.initDriver(prop.getProperty("login1.browser"));
	        }
	       
	        else {
	            // fallback safety
	            DriverFactory3.initDriver(prop.getProperty("login1.browser"));
	        }        
	    }

	   @After
	    public void tearDown(Scenario Scenario)
	    {
		   WebDriver driver = DriverFactory3.getDriver(); // ✅ CORRECT SOURCE
	        if (driver != null) {
	            byte[] screenshot =
	                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            Scenario.attach(screenshot, "image/png", Scenario.getName());
	        }

	        DriverFactory3.quitDriver(); // ✅ clean ThreadLocal
	    }
	}