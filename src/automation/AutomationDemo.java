package automation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationDemo extends BaseClass{


	@Test(groups={"smoke"}, alwaysRun=true)
	public void verifyGmail() {


		driver.get("https://www.google.com/intl/en-GB/gmail/about/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("For work")).click();


		driver.findElement(By.xpath("(//a/span[.='Create an account'])[1]")).click();


		driver.findElement(By.id("firstName")).sendKeys("test@gmail.com");

		driver.findElement(By.id("lastName")).sendKeys("1234567890");

	}
	
	
	@DataProvider(name="dataProvider")
	public Object[][] data(){
		
		return new Object[][] {{"7","Oct","1993"}};
	}

	
	
	@Test(dataProvider="dataProvider",groups= {"facebook"})
	public void dropDownFacebook(String Day, String Month, String Year) {

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();


		driver.findElement(By.xpath("//a[.='Create New Account']")).click();

		//Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Select day = new
				Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));

		day.selectByValue(Day);

		Select month = new
				Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));

		month.selectByVisibleText(Month);

		Select year = new
				Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));

		year.selectByVisibleText(Year);

		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();


	}


	public void selectDropDownByvalue(WebElement element, String value) {

		Select select = new Select(element);

		select.selectByValue(value);


	}


	@Test(groups= {"smoke"})
	public void makeMyTrip() {

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();


		driver.findElement(By.className("langCardClose")).click();

		driver.findElement(By.id("fromCity")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement fromCity = driver.findElement(By.xpath("//div[@id='react-autowhatever-1']//ul/li[1]/div"));


		Actions action = new Actions(driver);

		action.moveToElement(fromCity).click().build().perform();


	}

	@Test(groups={"regression"})
	public void selecrtRoundTrip() {


		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		driver.findElement(By.xpath("//li[@data-cy='roundTrip']/span")).click();

	}


	@Test
	public void actionsDemo() {

		driver.get("https://www.fnp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement cakes = driver.findElement(By.id("#cakesmenu"));

		WebElement birthdayCakes = driver.findElement(By.xpath("//div[@id='cakesmenu']//a[text()='Birthday']"));

		Actions action = new Actions(driver);

		action.moveToElement(cakes).click(birthdayCakes).build().perform();

	}


	public void dragAndDrop() {

		driver.get("https://demoqa.com/droppable");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));




		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		dragAndDropusingActions(drag,drop);

	}

	@Parameters({"url"})
	@Test(enabled=false)
	public void alertsDemo(String url) {


		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement ele1 = driver.findElement(By.id("promtButton"));

		//ele1.click();

		JavascriptExecutor executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].click();", ele1);

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.switchTo().alert().sendKeys("Vinay");

		driver.switchTo().alert().accept();


	}


	public void webTables() {

		driver.get("https://coinmarketcap.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td[3]//p"));

		System.out.println(rows.size());

		/*
		 * WebElement coinName =
		 * driver.findElement(By.xpath("(//table/tbody/tr[1]/td[3]//p)[1]"));
		 * 
		 * System.out.println(coinName.getText());
		 */

	}


	public void framesDemo() {

		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.id("frame1"));

		driver.switchTo().frame(frame1);

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());

		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.id("frame2"));

		driver.switchTo().frame(frame2);

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());


	}


	public void nestedFramesDemo() {

		driver.get("https://demoqa.com/nestedframes");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.id("frame1")));


		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));


		System.out.println(driver.findElement(By.xpath("//body/p")).getText());


		driver.switchTo().parentFrame();

		System.out.println(driver.findElement(By.xpath("//html/body")).getText());	
	}

	@Test
	public void windowHandling() {


		driver.get("https://www.way2automation.com/");


		driver.manage().window().maximize();


		String parentWindow = driver.getWindowHandle();

		//System.out.println(parentWindow);


		driver.findElement(By.xpath("//a[@aria-label='Facebook']")).click();

		switchToChildWindowCloseParent(parentWindow);
		
	}





	public void waitsDemo() {


		driver.get("https://www.easemytrip.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[text()='Book Now'])[1]"))));


		driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();

	}

	public void scrollDemo() {

		driver.get("https://www.fnp.com/");

		driver.manage().window().maximize();

		((JavascriptExecutor) driver).executeScript("window.scrollBy(2000,0)");

	}



}
