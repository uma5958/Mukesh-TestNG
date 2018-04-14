package com.Priorities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TEstNGScript2 {
	@Test (priority=1, description="This test case will verify the login functionality")
	public void loginApplication() {
		System.out.println("Login to Application");
		//Assert.assertEquals(12, 13);
	}
	@Test (priority=2, description="This test case will add certain items in the basket")
	public void selectItems() {
		System.out.println("Item Selected");
	}
	@Test (priority=3, description="This test case will perform checkout operation")
	public void checkOut() {
		System.out.println("Check out Completed");
	}
}
