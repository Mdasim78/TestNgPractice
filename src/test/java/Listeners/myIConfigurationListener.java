package Listeners;

import org.testng.IConfigurationListener;
import org.testng.ITestResult;
/*
 * The listener IConfigurationListener allows you to be notified whenever TestNG is about to invoke a configuration (annotated with any of the @Before or @After annotation) method 
 * and declare it as a listener, as explained in the section about TestNG listeners. 
 * This listener also lets you be notified about whether a configuration passed, failed (or) if it got skipped.
 * 
 */
public class myIConfigurationListener implements IConfigurationListener {
	@Override
	public void beforeConfiguration(ITestResult tr) {
		System.out.println("before-configuration");
	}
	
	@Override
	public void onConfigurationSuccess(ITestResult tr) {
		System.out.println("confuguration-successful");
	}
	
	@Override
	public void onConfigurationFailure(ITestResult tr) {
		System.out.println("configuration-failed");
	}
	
	@Override
	public void onConfigurationSkip(ITestResult tr) {
		System.out.println("configuration-skipped");
	}
}
