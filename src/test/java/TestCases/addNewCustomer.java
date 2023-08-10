
package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.InputData;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addNewCustomer {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		InputData input = new InputData();
		driver.get(input.getAppURL());

	}

	@Test
	public void addNewCustomerTest() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(InputData.getUsername());
		lp.setPassword(InputData.getpassword());
		lp.clickLogin();	
		
		Thread.sleep(2000);		
		
		HomePage hp = new HomePage(driver);
		hp.clickNewCustomer();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
