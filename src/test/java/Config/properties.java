package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class properties {
	
	@Test
	public String getAppURL() throws IOException {
		
	InputStream input = new FileInputStream("F:\\OnlineClasses\\AutomationmorningBatch\\POMFramework\\src\\test\\java\\Config\\config.properties");
	Properties prop = new Properties();
	prop.load(input);
	String ApplicationURL = prop.getProperty("appURL");
	System.out.println(prop.getProperty("appURL"));
	return ApplicationURL;
	
	
	}

}
