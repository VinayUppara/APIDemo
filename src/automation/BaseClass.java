package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {


	public static WebDriver driver;

	@BeforeTest()
	public void setupDriver() {

		System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

		driver = new ChromeDriver();


	}

	

	public void switchToChildWindow(String parent) {


		Set<String> windowhandles = driver.getWindowHandles(); // 2 handles

		for(String window : windowhandles) { // go through the set of window handles


			if(!window.equals(parent)) {

				driver.switchTo().window(window); // switch to child

				//System.out.println(driver.findElement(By.id("sampleHeading")).getText()); //perform some action on child window

				driver.close(); // close parent

				driver.switchTo().window(parent);
			}

		}
		

	}
	
	public void switchToChildWindowCloseParent(String parent) {


		Set<String> windowhandles = driver.getWindowHandles(); // 2 handles

		for(String window : windowhandles) { // go through the set of window handles


			if(!window.equals(parent)) {

				driver.switchTo().window(window); // switch to child

				//System.out.println(driver.findElement(By.xpath("//html/body/text()"))); //perform some action on child window

				driver.switchTo().window(parent);
			
				driver.close();

				driver.switchTo().window(window);
				
				break;
			}

		}
		

	}


	public void dragAndDropusingActions(WebElement drag, WebElement drop) {


		Actions action = new Actions(driver);

		action.dragAndDrop(drag, drop).build().perform();

	}


	public void switchToAlertAndAccept() {


		driver.switchTo().alert().accept();

		driver.switchTo().defaultContent();
	}

	public void scrollToAnElement(WebElement ele) {


		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",ele);
	}

	public void scrollTillPageEnd() {

		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}



}
