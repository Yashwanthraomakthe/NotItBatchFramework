
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
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageDashBoardTextValidation {

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
		String actualText = hp.getDashboardText();
		String expectedText = "Dashboard";
		Assert.assertEquals(actualText, expectedText);
		Thread.sleep(2000);
		

	}

	@Test
	public void verifyNumberOfPanals() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(InputData.getUsername());
		lp.setPassword(InputData.getpassword());
		lp.clickLogin();
		Thread.sleep(2000);

		HomePage hp = new HomePage(driver);
		int actualPanels = hp.getNumberOfPanels();
		int expectedPanels = 7;

		Assert.assertEquals(actualPanels, expectedPanels);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
