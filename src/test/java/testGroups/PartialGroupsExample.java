package testGroups;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Partial groups: 
//group name assigned to class will automatically be assigned to all methods in the class
//we can give assign group name to any methods as well, which will make that method have both groups from class and from method

@Test(groups="DemoTestClass") //whole class will run because it's included in groupTest.xml except those are excluded
public class PartialGroupsExample {
	
	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(groups = "group1") //it won't run because it's excluded in groupTest.xml
	public void testMethod2() {
		System.out.println("testMethod2");
	}
	
	@Test(groups="group2")
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@BeforeTest(groups = "group1",alwaysRun=true) //group1 is excluded in groupTest.xml but it still runs because of alwaysRun=true
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@AfterTest(groups = "group1") //it won't run because it's excluded in groupTest.xml
	public void afterTest() {
		System.out.println("afterTest");
	}
	
}
