package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


 @Listeners(MyIExecutionListener.class) //listener annotation available to any class present in suite makes it available to all the classes in the suite
 public class MyIExecutionListener_Test{
	 
	 @Test
	 public void executionListenertest1() {
		 System.out.println("executionListenertest1");
	 }
	
}