package com.dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplication {
	@Test
	public void startApp() {
		Assert.assertEquals(12,13);
		System.out.println("Starting App");
	}
	@Test (dependsOnMethods="startApp")
	public void loginApp() {
		System.out.println("Login to App");
	}
	@Test (dependsOnMethods="{loginApp,startApp}")
	public void logoutApp() {
		System.out.println("Logout App");
	}
}
