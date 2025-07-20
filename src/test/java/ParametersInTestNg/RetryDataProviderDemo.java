package ParametersInTestNg;

import org.testng.IDataProviderMethod;
import org.testng.IRetryDataProvider;
import org.testng.annotations.DataProvider;

public class RetryDataProviderDemo implements IRetryDataProvider { 
	private int counter;

	@Override
	public boolean retry(IDataProviderMethod dataProvider) {
		counter=0;
		boolean status=true;
		if(counter<=2) {
			
			status=true;
			String className = dataProvider.getMethod().getDeclaringClass().getName();
			String dataProviderMethodName = dataProvider.getMethod().getName();
	        String methodName = className + "." + dataProviderMethodName + "()";
	        System.err.println("Retry the data provider method " + methodName + " ? " + status);
	        return status;
		}
		return false;
	}
	
	@DataProvider(name = "data", retryUsing = RetryDataProviderDemo.class)
	public Object[][] getData(){
		return new Object[][] {{"Asim",28},{"Qasim",26}};
	}
}
