package Listeners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyIDataProviderListener.class)
public class MyIDataProviderListener_Test {
	
	@DataProvider(name="dp")
	public Object[][] getData(){
		System.out.println("Executing dataprovider and returning 2D-object array");
		return new Object[][] {{"Asim",28},{"Qasim",26}};
	}
	
	@Test(dataProvider = "dp")
	public void printData(String name, int age) {
		System.out.println("Executing Test Method");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
