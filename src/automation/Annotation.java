package automation;

import org.testng.annotations.*;

/*import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;*/

public class Annotation {

	

	@BeforeTest
	public void beforeTest() {

		System.out.println("Before test");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before method");
	}

	@Test
	public void firstMethod()
	{
		
		System.out.println("Im the first method in this class");
	}
	
	@Test
	public void secondMethod()
	{
		
		System.out.println("Im the second method in this class");
	}
	
	@AfterMethod
	public void afterMethod() {

		System.out.println("After method");
	}
	
	@AfterClass
	public void afterClass() {

		System.out.println("After class");
	}
	@AfterTest
	
	public void afterTest() {

		System.out.println("After test");
	}
	@AfterSuite
	
	public void afterSuite() {

		System.out.println("After suite");
	}
	
	@BeforeClass
	public void beforeClass() {

		System.out.println("Before class");
	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite");
	}

}
