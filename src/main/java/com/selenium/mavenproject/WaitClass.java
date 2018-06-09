package com.selenium.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		 WebDriver driver= new  FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtPass")));
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();

	}

}
