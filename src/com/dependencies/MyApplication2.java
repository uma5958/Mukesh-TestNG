package com.dependencies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyApplication2 {
	WebDriver driver;
	@BeforeClass
	public void startBrowser(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("===Browser Started===");
	}
	@Test
	public void startApp() {
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("http"));
		System.out.println("App Started");
	}
	@Test (dependsOnMethods="startApp")
	public void loginApp() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		boolean status = driver.findElement(By.xpath("//b[text()='Admin']")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("Login successful");
	}
	@Test (dependsOnMethods="loginApp")
	public void logoutApp() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Welcome Admin'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
		System.out.println("Logout Done");
	}
	@AfterClass
	public void closeApp() {
		driver.quit();
		System.out.println("===Browser Closed===");
	}
}
