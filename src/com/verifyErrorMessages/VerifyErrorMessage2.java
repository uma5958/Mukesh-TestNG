package com.verifyErrorMessages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		String actual_error = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getAttribute("inerHTML");
		String expected_erroer="Enter an email or phone number";
		Assert.assertEquals(actual_error, expected_erroer);
		//Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
		System.out.println("Test Completed");
		driver.quit();
	}

}
