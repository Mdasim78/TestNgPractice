package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyISuiteListener.class)
public class MyISuiteListener_Test {
	@Test
	public void suiteListenerTest() {
		System.out.println("Suite Listener Test");
	}
}
