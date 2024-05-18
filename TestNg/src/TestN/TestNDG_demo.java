package TestN;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNDG_demo {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite Annotations");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Suite Annotations");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before class Annotations");
	}
	
	@Test
	public void logintest() {
		System.out.println("This is Test Annotations");
	}
	
	@Test
	public void Regtest() {
		System.out.println("This is Regtest test case login");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method Annotations");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method Annotations");
	}
	
	@AfterClass
	public void aftereClass() {
		System.out.println("This is aftereClass Annotations");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is aftereTest Annotations");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is aftere Suite Annotations");
	}
	
	
	
	 
	 
}
