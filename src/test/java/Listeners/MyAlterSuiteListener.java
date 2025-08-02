package Listeners;

import java.util.List;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

public class MyAlterSuiteListener implements IAlterSuiteListener{
	
	@Override
	public void alter(List<XmlSuite> suites) {
		for(XmlSuite suite: suites) {
			System.out.println(" Suite name : "+suite.getName());
			//suite.set
		}
	}
}
