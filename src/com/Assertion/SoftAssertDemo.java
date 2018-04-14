package com.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void testSoftAssert() {
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test Started");
		assertion.assertEquals(12, 13, "Count doesn't match");
		System.out.println("Test complted");
		assertion.assertAll();
	}
	@Test
	public void testHardAssert() {
		System.out.println("Test2 Started");
		Assert.assertEquals(12, 13);
		System.out.println("Test2 complted");
	}
}
