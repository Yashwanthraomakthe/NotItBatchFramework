package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.properties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GuruHomePageTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://demo.guru99.com/V1/index.php");
		properties p = new properties();
		driver.get(p.getAppURL());

	}

	@Test
	public void LoginTest() {
		driver.findElement(By.name("uid")).sendKeys("mngr520082");
		driver.findElement(By.name("password")).sendKeys("YvuqEve");
		driver.findElement(By.name("btnLogin")).click();
		

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
