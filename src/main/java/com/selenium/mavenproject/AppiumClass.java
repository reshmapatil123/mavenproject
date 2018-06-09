package com.selenium.mavenproject;

		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.remote.RemoteWebDriver;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;
		
				 

		public class AppiumClass 
		{
			WebDriver driver;
			
		  @Test
		  public void f() 
		  {
			  	driver.findElement(By.name("email")).sendKeys("Saurab");
			  	driver.findElement(By.name("pass")).sendKeys("Amol");
			  	driver.findElement(By.name("login")).click();
		  }
		  
		  
		  @BeforeTest
		  public void beforeTest() throws MalformedURLException 
		  {
			  DesiredCapabilities capabilities = new DesiredCapabilities();
			  capabilities.setCapability("browserName", "chrome");
			  capabilities.setCapability("deviceName", "Redmi");
			  capabilities.setCapability("platformName", "Android");
			  capabilities.setCapability("platformVersion", "7.1");
			  driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			  driver.get("https://www.facebook.com/login");
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }

		  @AfterTest
		  public void afterTest() 
		  {
			  driver.quit();
		  }

		


	}


