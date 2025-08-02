package Interceptors;


import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.internal.MethodInstance;
/*
 * 
 * need to study this
 * 
 */
public class InterceptMethods implements IMethodInterceptor{  //we need to create class and implemet imethod interceptor and override intercept method

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		// TODO Auto-generated method stub
		
		List<IMethodInstance> orderedMethods = new ArrayList<IMethodInstance>();
		for(IMethodInstance m:methods) {
			//Test test = m.getMethod().
		}
		
		return null;
	}

}

class MethodInterceptorsDemo {
	
	@Test
	public void demo1() {
		
	}
}
