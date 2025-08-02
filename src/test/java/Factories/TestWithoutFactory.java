package Factories;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestWithoutFactory {
	
	//Factories allow you to create tests dynamically. 
	//For example, imagine you want to create a test method that will access a page on a website several times, and you want to invoke it with different values:
	//to achieve this without using "factory"   we have to create tests in testng suite several times with different parameter
	@Test
	@Parameters("demovalue")
	public void testWithoutFactory(String value){
		
		     System.out.println("This method is run : "+value);
		    
	}
}
