package testGroups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOfGroups {
	
	@Test(groups="group2")
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
	
	@Test(groups="group3")
	public void testMethod4() {
		System.out.println("testMethod4");
	}
	
	@BeforeGroups(groups = "group2") //it will run once before any method belong to group2 is run
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups");
	}
}
