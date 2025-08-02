package Listeners;

import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;

/*
 * The listener IDataProviderListener allows you to be notified whenever TestNG is about invoke data provider methods. 
 */
public class MyIDataProviderListener implements IDataProviderListener{
	
	@Override
	public void beforeDataProviderExecution(IDataProviderMethod dpm, ITestNGMethod tm, ITestContext tc) {
		System.out.println("Before Dataprovide method - listener");
	}
	
	@Override
	public void afterDataProviderExecution(IDataProviderMethod dpm, ITestNGMethod tm, ITestContext tc) {
		System.out.println("After Dataprovide method - listener ");
	}
	
	@Override
	public void onDataProviderFailure(ITestNGMethod method, ITestContext ctx, RuntimeException t) {
		System.out.println("Data provider failure - listener");
	}
}
