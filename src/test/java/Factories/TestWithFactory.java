package Factories;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

 class TestWithFactory {
	/*
	Factories allow you to create tests dynamically. 
	For example, imagine you want to create a test method that will access a page on a website several times, and you want to invoke it with different values:
	Factory method most must return Object[]. The objects returned can be of any class (not necessarily the same class as the factory class) 
		and they don’t even need to contain TestNG annotations (in which case they will be ignored by TestNG).
	*/
	
//	@Factory //we can pass (dataProvider="dp") attribute to pass data from Data provider methods
//	public Object[] createInstance() {
//		//i will study this later
//		WebTest[] webTestArr = new WebTest[2];
//		webTestArr[0] = new WebTest(1, "value1");
//		webTestArr[1] = new WebTest(2, "value2");
//		return webTestArr;
//	}
	
	@Factory(dataProvider = "dp") //we can pass (dataProvider="dp") attribute to pass data from Data provider methods
	public Object[] createInstanceFromDP(int count,String name) {
		return new Object[] {new WebTest(count, name)};
	}
	
	@DataProvider(name = "dp")
	public Object[][] createData(){
		//Object[][] names = {{"Asim"},{"Qasim"},{"Ashraf"}};
		return new Object[][]{{1,"Asim"},{2, "Qasim"},{3, "Ashraf"}};
	}
	
}

 class WebTest {
	int count;
	String value;
	
	public WebTest() {
		
	}
	
	public WebTest(int count,String value) {
		this.count=count;
		this.value=value;
	}
	
	@Test
	public void testFactoryInvocation() {
		System.out.println("count: "+count+" <> "+"value : "+value);
	}
	
	@Test
	public void testFactoryWithDP() {
		System.out.println("Factory with DP : count: "+count+" <> "+"value : "+value);
	}
}
