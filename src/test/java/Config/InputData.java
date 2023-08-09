package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InputData {

	public String getAppURL() throws IOException {
		FileInputStream input = new FileInputStream(
				"F:\\OnlineClasses\\AutomationmorningBatch\\POMFramework\\src\\test\\java\\Config\\config.properties");
		Properties prop = new Properties();
		prop.load(input);
		String ApplicationURL = prop.getProperty("appURL");
		System.out.println(prop.getProperty("appURL"));
		return ApplicationURL;

	}

	public static String getUsername() throws IOException {

		InputStream input = new FileInputStream(
				"F:\\OnlineClasses\\AutomationmorningBatch\\POMFramework\\src\\test\\java\\Config\\config.properties");
		Properties prop = new Properties();
		prop.load(input);
		String username = prop.getProperty("username");		
		return username;

	}

	public static String getpassword() throws IOException {

		InputStream input = new FileInputStream(
				"F:\\OnlineClasses\\AutomationmorningBatch\\POMFramework\\src\\test\\java\\Config\\config.properties");
		Properties prop = new Properties();
		prop.load(input);
		String password = prop.getProperty("password");
		return password;

	}

}
