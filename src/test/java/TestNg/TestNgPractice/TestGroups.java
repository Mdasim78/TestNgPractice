package TestNg.TestNgPractice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="DemoTestClass")
public class TestGroups {
	
	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(groups = "group1")
	public void testMethod2() {
		System.out.println("testMethod2");
	}
	
	@Test(groups="group2")
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups");
	}
}
