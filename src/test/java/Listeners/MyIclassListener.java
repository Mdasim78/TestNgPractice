package Listeners;

import org.testng.IClass;
import org.testng.IClassListener;
import org.testng.ITestClass;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlTest;

/*
 * The listener IClassListener allows you to be notified whenever TestNG is about to start processing a test class and invoke its configuration/tests.
 */
public class MyIclassListener implements IClassListener {
	
	@Override
	public void onBeforeClass(ITestClass tc) {
		System.out.println("onBeforeClass - listener");
	}
	
	@Override
	public void onAfterClass(ITestClass tc) {
		System.out.println("onAfterClass - listener");
	}
}
