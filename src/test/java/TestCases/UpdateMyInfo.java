package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.InputData;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Myinfo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateMyInfo {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		InputData input = new InputData();
		driver.get(input.getAppURL());
		Thread.sleep(2000);

	}

	@Test
	public void clickmyInfoTest() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(InputData.getUsername());
		lp.setPassword(InputData.getpassword());
		lp.clickLogin();

		Thread.sleep(2000);

		HomePage hp = new HomePage(driver);
		hp.clickMyInfo();
		Thread.sleep(2000);
		
		Myinfo mi = new Myinfo(driver);
		mi.setFirstname();
		Thread.sleep(2000);
		mi.setemployeeId();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
