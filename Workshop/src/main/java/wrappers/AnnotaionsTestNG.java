package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotaionsTestNG extends WDwrappers
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test executed");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class executed");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		invokeApp("chrome", "http://leaftaps.com/opentaps/");
	}

	@AfterMethod
	public void afterMethod()
	{
		QuitApp();
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class executed");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test executed");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite executed");
	}
	
	
	
	
	
	
	
}
