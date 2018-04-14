package com.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	@Test
	public void test1() {
		Assert.assertEquals(12, 13);
	}
	@Test
	public void test2() {
		System.out.println("Test Case2 Started");
		Assert.assertEquals(12, 13, "Dropdown count doesn't match Please check with developper");
		System.out.println("Test case2 completed");
	}
	@Test
	public void test3() {
		System.out.println("Test Case3 Started");
		Assert.assertEquals("Hello", "Hello", "Word doesn't match please rise a bug");
		System.out.println("Test case3 completed");
	}
}
