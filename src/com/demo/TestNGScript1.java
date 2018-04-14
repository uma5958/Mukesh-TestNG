package com.demo;

import org.testng.annotations.Test;

public class TestNGScript1 {
	@Test
	public void loginApplication() {
		System.out.println("Login to Application");
	}
	@Test
	public void selectItems() {
		System.out.println("Item Selected");
	}
	@Test
	public void checkOut() {
		System.out.println("Check out Completed");
	}
}
