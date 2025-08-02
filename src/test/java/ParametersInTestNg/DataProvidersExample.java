package ParametersInTestNg;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersExample {
	
	//data provider method must return 2-d object array --> Object[][] or custom boject array -->  MyCustomData[][] or Iterator<MyCustomData>
	@DataProvider(name = "personalData")
	public Object[][] createData(Method m) { 
		//method param is optinal and it can be use to reflect method where it's being called like below 
		System.out.println("Data prvider method is invoked in method : "+m.getName());
		//implement excel reading/writing to get the data i am providing hard coded data to demo data provides only
		//we can pass custom objects as parameters as well
		Object[][] personalData= new Object[][] {
			{"Asim","Automation Tester",3.5f},
			{"Qadir","Data Analyst",2f},
			{"Danish","Cobol Professional",2f}
		};
		return personalData;
		
	}
	
	//if dataprovider method is in different class then we need to write--> (dataProviderClass = className.class)
	@Test(dataProvider = "personalData",dataProviderClass = DataProvidersExample.class) 
	public void getPersonalInfo(String name, String role, float experience) {
		System.out.println(name+" has "+experience+" years of experience in "+role);
	}
}
