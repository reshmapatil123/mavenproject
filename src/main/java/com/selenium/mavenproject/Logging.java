package com.selenium.mavenproject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logging {
      static Logger logx=Logger.getLogger(Logging.class);
	public static void main(String[] args) {
   
		PropertyConfigurator.configure("resources/log4j.properties");
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		WebDriver driver= new  FirefoxDriver();
		logx.info("opened browser");
		 
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		logx.info("opened the URL");
		driver.manage().window().maximize();
		logx.info("max");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		logx.info("entered username");
	    
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		logx.info("entered password");
	
		driver.findElement(By.id("btnLogin")).click();
		logx.info("clicked on login button");
	    
		driver.quit();

	}

}
