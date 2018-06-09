package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass {
	WebDriver driver;
    @BeforeTest
	public void before() {
	System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
	 driver= new  FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();

}
    @Test
    public void mouseover() {
  	  WebElement adminTab=driver.findElement(By.xpath("//b[text()='Admin']"));
  		WebElement userManagementTab=driver.findElement(By.xpath("//a[text()='User Management']"));
  		WebElement userTab=driver.findElement(By.xpath("//a[text()='Users']"));
  				
  		Actions act= new Actions(driver);
  		act.moveToElement(adminTab).moveToElement(userManagementTab).moveToElement(userTab).click().build().perform();
  		
  		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("reshma");//20
  	  
  	  
  	  
    }

  @Test
   public void drag() throws InterruptedException {
	  driver.navigate().to("http://jqueryui.com/droppable/");
	  Thread.sleep(5000);
	  WebElement x=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  driver.switchTo().frame(x);
	  WebElement SourceElem=driver.findElement(By.id("draggable"));
	  WebElement TargetElem=driver.findElement(By.id("droppable"));
	  
	  Actions act= new Actions(driver);
	  act.dragAndDrop(SourceElem, TargetElem).perform();
	  }
 /* @Test(enabled=false)
  public void rightclick() {
	  
	  WebElement adminTab=driver.findElement(By.xpath("//b[text()='Admin']"));
		Actions act= new Actions(driver);
		act.contextClick(adminTab).perform();
	
  }*/
 
   @AfterTest
   public void after() {
	   
	   driver.quit();
   }
}