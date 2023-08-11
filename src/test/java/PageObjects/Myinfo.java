package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Myinfo {
	
	public Myinfo(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver = null;

	By text_firstname = By.name("firstName");
	By text_empID = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input");
	
	public void setFirstname() {
		driver.findElement(text_firstname).clear();
		driver.findElement(text_firstname).sendKeys("testing");
	}
	
	public void setemployeeId() {
		driver.findElement(text_empID).clear();
		driver.findElement(text_empID).sendKeys("12345");
	}

}
