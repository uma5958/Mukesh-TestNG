package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test cases started and the details are: "+result.getTestName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases success and the details are: "+result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cases failed and the details are: "+result.getTestName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cases skipped and the details are: "+result.getTestName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		
	}
	
}
