package Dependancies;

import org.testng.annotations.Test;

public class GroupDependanciesInTestNgXml {
	
	@Test(groups = "GroupDependancyInXml1")
	public void test1() {
		System.out.println("GroupDependancyInXml1 --> this will run after GroupDependancyInXml2");
	}
	
	@Test(groups = "GroupDependancyInXml2")
	public void test3() {
		System.out.println("GroupDependancyInXml2 --> this will run before GroupDependancyInXml1");
	}
	
	@Test
	public void test2() {
		System.out.println("test3");
	}
}

//it only works when ine group is dependent on another group