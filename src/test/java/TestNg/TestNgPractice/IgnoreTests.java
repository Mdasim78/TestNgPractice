package TestNg.TestNgPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTests {
	
	@Test
	@Ignore  //test1 will be ignored ---  @Ignore annotation has a higher priority than individual @Test method annotations.
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
}

//try to comment and uncomment to see difference
//IgnoreEntireClass will be ignored --- When @Ignore is placed on a class, all the tests in that class will be disabled.
@Ignore 
class IgnoreEntireClass{
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
}