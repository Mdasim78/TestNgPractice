package ParametersInTestNg;

import java.util.concurrent.atomic.AtomicInteger;

import org.testng.IDataProviderMethod;
import org.testng.IRetryDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//data provider class which implements --> IRetryDataProvider
public class RetryDataProviderDemo implements IRetryDataProvider { 
	private final AtomicInteger counter = new AtomicInteger(1);

	@Override
	public boolean retry(IDataProviderMethod dataProvider) {
		System.out.println(counter);
		boolean status = counter.getAndIncrement() <= 2;
		String className = dataProvider.getMethod().getDeclaringClass().getName();
		String dataProviderMethodName = dataProvider.getMethod().getName();
		String methodName = className + "." + dataProviderMethodName + "()";
		System.err.println("Retry the data provider method " + methodName + " ? " + status);

		return status;

	}

}

//actual test class
class RetriableDataProviderSample {
	private boolean thowException=true;

	@DataProvider(name = "data", retryUsing = RetryDataProviderDemo.class)
	public Object[][] getData(){
		if(thowException) {
			thowException=false;
			System.err.println("Simulating a problem when invoking the data provider"); //prints output in red color
			throw new IllegalStateException("Simulating a failure in data provider");
		}
		return new Object[][] {{"Asim",28},{"Qasim",26}};
	}

	@Test(dataProvider = "data")
	public void retryDataProviderTest(String name, int age) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
