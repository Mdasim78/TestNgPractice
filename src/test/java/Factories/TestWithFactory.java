package Factories;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestWithFactory {
	/*
	Factories allow you to create tests dynamically. 
	For example, imagine you want to create a test method that will access a page on a website several times, and you want to invoke it with different values:
	Factory method most must return Object[]. The objects returned can be of any class (not necessarily the same class as the factory class) 
		and they don’t even need to contain TestNG annotations (in which case they will be ignored by TestNG).
	*/
	
	@Factory //we can pass (dataProvider="dp") attribute to pass data from Data provider methods
	public Object[] createInstance() {
		//i will study this later
		WebTest[] webTestArr = new WebTest[2];
		webTestArr[0] = new WebTest(1, "value1");
		webTestArr[1] = new WebTest(2, "value2");
		return webTestArr;
	}
	
}

class WebTest {
	int count;
	String value;
	
	public WebTest(int count,String value) {
		this.count=count;
		this.value=value;
	}
	
	@Test
	public void testFactoryInvocation() {
		System.out.println("count: "+count+" <> "+"value : "+value);
	}
}
