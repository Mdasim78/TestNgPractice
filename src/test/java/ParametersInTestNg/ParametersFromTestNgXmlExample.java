package ParametersInTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersFromTestNgXmlExample {
	@Test
	@Parameters({"param1","param2"})
	public void testMethod1(String param1, int param2) {
		System.out.println(param1);
		System.out.println(param2);
	}
	
	@Test
	@Parameters("param3")
	public void testMethod2(String param3) {
		System.out.println("testMethod2 : "+param3);
	}
	
	@BeforeClass
	@Parameters("param4")
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass(dependsOnGroups = "")
	public void afterClass() {
		System.out.println("afterClass");
	}
	

}
