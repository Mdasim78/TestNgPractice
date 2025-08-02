package Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyISuiteListener implements ISuiteListener {
	
	@Override
	public void onStart(ISuite suite) {
		System.out.println("Started suite : "+ suite.getName());
	}
	
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Finished suite : "+ suite.getName());
	}

}
