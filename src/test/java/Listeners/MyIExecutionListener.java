package Listeners;

import org.testng.IExecutionListener;

public class MyIExecutionListener implements IExecutionListener{
	@Override
	public void onExecutionStart() {
		System.out.println("This will run when TestNgExecution starts even before suite is executed");
		System.out.println("-----------------------------------------");
	}
	
	@Override
	public void onExecutionFinish() {
		System.out.println("This will run after suite is executed and just before TestNgExecution finishes");
		System.out.println("-----------------------------------------");
	}
}
