package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Config.InputData;
import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		InputData input = new InputData();
		driver.get(input.getAppURL());
		
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		

	}

	@Test
	public void LoginTest() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(InputData.getUsername());
		lp.setPassword(InputData.getpassword());
		lp.clickLogin();	
		
	

	}

	@Test
	public void verifyTitleTest() throws IOException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";		
		Assert.assertEquals(actualTitle, expectedTitle, "Our titles are correct");
		
		
		

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
