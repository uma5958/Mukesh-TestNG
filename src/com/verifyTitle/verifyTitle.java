package com.verifyTitle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyTitle {
	@Test
	public void verifyApplicationTitle() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://learn-automation.com/");
		//Actual Title
		String my_title = driver.getTitle();
		System.out.println("Title is: "+my_title);
		//String expected_title="Selenium Webdriver Tutorials - Free Selenium Tutorial";
		//Assert.assertEquals(my_title, expected_title);	
		Assert.assertTrue(my_title.contains("Selenium WebDriver tutorial"));
		System.out.println("Test Completed - Page Verified");
		driver.quit();
	}
}
