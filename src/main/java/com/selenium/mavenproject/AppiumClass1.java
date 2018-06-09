package com.selenium.mavenproject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumClass1 {
    static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		File application=new File("resources/TheMallApp (1).apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("browserName", "chrome");
		  capabilities.setCapability("deviceName", "Redmi");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("platformVersion", "7.1");
		  capabilities.setCapability("App",application.getAbsolutePath());
		  driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		 // WebElement jerry=driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
		//  jerry.click();
		//  WebElement map=driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		 // map.click();
		  
		  driver.quit();
		

	}

}
