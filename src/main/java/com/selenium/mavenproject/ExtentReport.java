package com.selenium.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReport {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports  extent;
	ExtentTest test;

	@BeforeTest
	public void beforetest() {
		
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		 test = extent.createTest("MyFirstTest");
		test.pass("details");
		
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		 driver= new  FirefoxDriver();
		 test.pass("opened browser");
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		

	}
	
	 @Test
	public void Test() {
		
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    test.pass("entered username");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			test.pass("entered password");
			driver.findElement(By.id("btnLogin")).click();
		
	}
	 @AfterTest
	 public void aftertest() {
		 extent.flush();
		 driver.quit();
		 
		 
	 }

}
