package com.selenium.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class SeleniumClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		WebDriver driver= new  FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		String ExpectedURL="http://opensource.demo.orangehrmlive.com/index.php/dashboard";
		String ActualURL=driver.getCurrentUrl();
		
		//Assert.assertEquals(ActualURL, ExpectedURL);//-----hard
		
		SoftAssert soft=new SoftAssert();//--------soft
		soft.assertEquals(ExpectedURL,ActualURL );
		
		System.out.println("my name is Reshma");
		
		
		soft.assertAll();
		
		//driver.quit();
	}

}
