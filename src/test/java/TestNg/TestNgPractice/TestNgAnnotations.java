package TestNg.TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	@Test(groups = {"exclude","dependsONgroup"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(enabled=false) //it will not run even if included in testNg groups
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(dependsOnMethods = "test1",groups = "exclude") //two annotation attributes can be separated by comma ,
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups = {"include","dependsONgroup"},priority = 0,invocationCount = 2)  //if more than one method in depends on then {} is mandatory
	public void test4() {
		System.out.println("test4");
	}
	
	@BeforeMethod(alwaysRun = false,dependsOnGroups = "testGroup")
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod(groups = "include")
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass(dependsOnGroups = "")
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups");
	}
	@BeforeTest(groups = "include",alwaysRun=false) //it will run because it's included
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@BeforeSuite(groups = "exclude",alwaysRun=true) //always runs even if it's excluded from test groups
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
}
