package Dependancies;

import org.testng.annotations.Test;

public class DependanciesWithAnnotations {
	
	//Depends on the methods or depends on groups Make sure that this method is run after all the methods/groups in which it depends on  is run already
	
	@Test
	public void test1() {
		System.out.println("test1");
		//throw new IllegalStateException("trying to test dependsOnmethod"); 
	}
	
	 //alwaysRun = false or with out any alwaysRun ---> hard dependency and will be skipped if error occurs 
	 //alwaysRun = true  ---> soft dependency and will be skipped if error occurs 
	@Test(dependsOnMethods = "test1", alwaysRun = false) //depend on method -- we can use wild card like --> test.*
	public void test2() { 		
		System.out.println("test2 will run after test1");
	}
	
	@Test(groups = "dependsOnGroupDemo1")
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups = "dependsOnGroupDemo2")
	public void test4() {
		System.out.println("test4");
		//throw new IllegalStateException("trying to test dependsOnmethod"); 
	}
	
	@Test(dependsOnGroups = {"dependsOnGroupDemo1","dependsOnGroupDemo2"}) //depends on group -- we can use wild card like -- dependsOnGroupDemo1.*
	public void test5() {
		System.out.println("test5  will run after all methods in groups: dependsOnGroupDemo1 & dependsOnGroupDemo2");
	}
}
