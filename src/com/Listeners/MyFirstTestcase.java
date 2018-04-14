package com.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (com.Listeners.TestNgListeners.class)
public class MyFirstTestcase {
	@Test
	public void GoogleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test
	public void TitleMatch() {
		System.out.println("Test2 Dummy");
		Assert.assertTrue(false);
	}
}
