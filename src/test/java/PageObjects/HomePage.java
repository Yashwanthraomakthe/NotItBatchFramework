package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver = null;

	By link_newCustomer = By.linkText("New Customer");
	
	public void clickNewCustomer() {
		driver.findElement(link_newCustomer).click();
	}

}
