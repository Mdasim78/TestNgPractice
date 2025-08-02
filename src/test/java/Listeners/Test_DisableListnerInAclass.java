package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@DisableListener  //uncomment to see changes in console output
//@Listeners({MyIInvokedMethodListener.class})
public class Test_DisableListnerInAclass {
	
	//@DisableListener    //uncomment to see changes in console output
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
