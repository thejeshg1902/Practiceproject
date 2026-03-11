package factory3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory3 {
	
	
	    // ThreadLocal for parallel execution
	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    // Initialize browser
	    public static void initDriver(String browserName) {

	        if (browserName.equalsIgnoreCase("chrome")) {
	            driver.set(new ChromeDriver());
	        }
	        else if (browserName.equalsIgnoreCase("firefox")) {
	            driver.set(new FirefoxDriver());
	        }
	        // SafariDriver
	        else if (browserName.equalsIgnoreCase("edge")) {
	            driver.set(new EdgeDriver());
	        }
	        else {
	            throw new RuntimeException("Browser not supported: " + browserName);
	        }

	        driver.get().manage().window().maximize();
	    }

	    // Get driver
	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    // Quit driver
	    public static void quitDriver() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	        }
	    }
	}

	
	


