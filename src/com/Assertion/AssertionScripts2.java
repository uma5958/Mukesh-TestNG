package com.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts2 {
	@Test
	public void test1() {
		String mysStr="Uma";
		Assert.assertTrue(mysStr.contains("Mahesh"), "Nmaes are not matching");
	}
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
}
