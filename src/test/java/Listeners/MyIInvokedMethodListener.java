package Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyIInvokedMethodListener implements IInvokedMethodListener{
	/*
	 * The listener IInvokedMethodListener allows you to be notified whenever TestNG is about to invoke a test (annotated with @Test) 
	 * or configuration (annotated with any of the @Before or @After annotation) method and declare it as a listener
	 */
	@Override
	public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult testResult) {
       DisableListener disableListener = iInvokedMethod.getTestMethod().getTestClass().getRealClass().getAnnotation(DisableListener.class);
       if(disableListener != null) {
    	   return;
       }
       System.out.println("Invoking method : "+iInvokedMethod.getTestMethod().getMethodName()+" in class : "+iInvokedMethod.getTestMethod().getTestClass().getName());
	}
	
	@Override
	public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult testResult) {
	      DisableListener disableListener = iInvokedMethod.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(DisableListener.class);
	      if(disableListener != null) {
	    	   return;
	       }
		System.out.println("Invokation complete for method : "+iInvokedMethod.getTestMethod().getMethodName()+" in class : "+iInvokedMethod.getTestMethod().getTestClass().getName());
	    }
	
	
}

