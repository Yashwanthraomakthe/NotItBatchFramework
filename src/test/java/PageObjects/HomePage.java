package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver = null;

	By link_myInfo = By.linkText("My Info");
	By lable_Dashboard = By.className("oxd-topbar-header-breadcrumb");
	
	public void clickMyInfo() {
		driver.findElement(link_myInfo).click();
	}
	
	public String getDashboardText() {
		String lable = driver.findElement(lable_Dashboard).getText();
		return lable;
	}

}
