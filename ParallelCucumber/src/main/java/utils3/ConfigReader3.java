package utils3;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader3 {
	
	    private static Properties prop;

	    public static Properties getProp() {

	        if (prop == null) {
	            try {
	                prop = new Properties();
	                FileInputStream fis = new FileInputStream(
	                        System.getProperty("user.dir")
	                        + "/src/test/resources/config3/config3.properties"
	                );
	                prop.load(fis);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return prop;
	    }
	}

	




