package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {

	private static WebDriver driver;
	private static DriverType driverType;
	private static ConfigReader configReader;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			configReader = new ConfigReader();
			driverType = configReader.getBrowser();
			createDriver();
		}
		return driver;
	}
	
	private static void createDriver() {
        switch (driverType) {
        	case EDGE : System.setProperty(configReader.getDriverKey(),configReader.getDriverPath());
        		EdgeOptions options = new EdgeOptions();
        		options.setPageLoadTimeout(Duration.ofSeconds(configReader.getImplicitWaitTime()));
        		options.setImplicitWaitTimeout(Duration.ofSeconds(configReader.getImplicitWaitTime()));
        		driver = new EdgeDriver(options);
        		break;
	        case FIREFOX : //to-implement
		    	break;
	        case CHROME : //to-implement
	    		break;
        }
        
        if(configReader.getBrowserWindowMaximized())
        	driver.manage().window().maximize();
	}
	
	public static void closeDriver() {
		driver.close();
		driver.quit();
	}
}
