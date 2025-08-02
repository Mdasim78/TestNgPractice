package TestNg.TestNgPractice;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;
/*
 * Every time tests fail in a suite, TestNG creates a file called testng-failed.xml in the output directory.
 * This XML file contains the necessary information to rerun only these methods that failed, allowing you to quickly reproduce the failures without having to run the entirety of your tests
 *
 *
 *Sometimes, you might want TestNG to automatically retry a test whenever it fails. In those situations, you can use a retry analyzer.
 */

//IRetryAnalyzer is used to retry failed test cases automatically
public class RetryFailedTests implements IRetryAnalyzer{
	static int retryCount=1;
	
	@Override
	public boolean retry(ITestResult result) {
		while(retryCount<3) {
			System.out.println("retrying '"+result.getName()+"' method from '"+result.getClass()+"' for : "+retryCount+" times.");
			retryCount++;
			return true;
		}
		return false;
	}
	
}

class myTestClass{
	
	@Test(retryAnalyzer = RetryFailedTests.class) //need to pass class in which retryAnalyzer has been implemented.
	public void retryTestDemo() {
		if(RetryFailedTests.retryCount>3) Assert.fail();
		else System.out.println("passed");
	}
}
