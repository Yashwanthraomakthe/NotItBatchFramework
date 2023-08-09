package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver = null;

	By textbox_username = By.name("uid");
	By textbox_password = By.name("password");
	By button_login = By.name("btnLogin");

	public void setUsername(String username) {
		driver.findElement(textbox_username).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(textbox_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(button_login).click();
	}

}
