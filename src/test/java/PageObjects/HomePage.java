package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver = null;

	By link_myInfo = By.linkText("My Info");
	By lable_Dashboard = By.className("oxd-topbar-header-breadcrumb");
	By  noOfPanels= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div");
	
	
	public void clickMyInfo() {
		driver.findElement(link_myInfo).click();
	}
	
	public String getDashboardText() {
		String lable = driver.findElement(lable_Dashboard).getText();
		return lable;
	}
	
	public int getNumberOfPanels() {
		List<WebElement> panelsCount = driver.findElements(noOfPanels);
		int count = panelsCount.size();
		return count;
	}
	
	
	
	

}
