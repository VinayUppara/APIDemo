package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import pageobjects.Homepage;

public class FnpDemo extends BaseClass {
	
	
	Homepage home = new Homepage(driver);
	
	
	public void fnpDemo() {
		
	driver.get("https://www.fnp.com/");
	
	driver.manage().window().maximize();
	
	//scrollToAnElement(home.viewAll);
	
	scrollTillPageEnd();
	}
	

	
	
	static public void main(String...strings) {
		
		new FnpDemo().fnpDemo();
	}

}
