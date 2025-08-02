package Listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(myIConfigurationListener.class)
public class myIConfigurationListener_Test {
	
	@Test
	public void testConfigListner() {
		System.out.println("testConfigListner");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
}
