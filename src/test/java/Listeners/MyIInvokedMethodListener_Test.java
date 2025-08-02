package Listeners;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyIInvokedMethodListener.class)
public class MyIInvokedMethodListener_Test {
	
	@Test
	public void invokedMethodListenerTest1() {
		System.out.println("MyIInvokedMethodListener_Test1");
	}
	
	
	@BeforeMethod
	public void invokedMethodListenerBeforeMethod() {
		System.out.println("invokedMethodListenerBeforeMethod");
	}
}
