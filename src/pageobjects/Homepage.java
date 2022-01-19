package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.BaseClass;

public class Homepage extends BaseClass{

	
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@id='fnplogo']/following-sibling::div[2]")
	public WebElement selectDelivery;
	
	
	@FindBy(xpath="//input[@placeholder='Enter Pincode']")
	public WebElement enterPincode;
	
	@FindBy(xpath="(//a[text()='View All'])[2]")
	public WebElement viewAll;
	
	
	
	
}
