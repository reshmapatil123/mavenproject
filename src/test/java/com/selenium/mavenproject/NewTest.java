package com.selenium.mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver webpage;
  @Test(priority=1)
  public void f() {
	 login ref=new  login(webpage);
		ref.loginpage();	 
  }
  @Test(priority=2)
  public void addtocard() throws InterruptedException {
	  addtocard ref=new  addtocard(webpage);
	  ref.addtocardfunction();
  }
  @Test(priority=3)
  public void checkout() {
	  checkout ref=new checkout(webpage);
	  ref.CheckoutFunction();
   }
  @Test(priority=4)
  public void signIn() {
	  SignIn ref=new SignIn(webpage);
	  ref.signINfunction();
	   }
  @Test(priority=5)
  public void address() {
	  
	  Address ref=new Address(webpage);
	  ref.addressfunction();
  }
  @Test(priority=6)
  public void shipping() {
	  Shipping ref=new Shipping(webpage);
	  ref.shippingFunction();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
	    webpage=new FirefoxDriver();
		webpage.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	 
  }

  @AfterTest
  public void afterTest() {
	  WebElement signout = webpage.findElement(By.xpath("//a[@title='Log me out']"));
	   signout.click();	
	  webpage.quit();
  }

}
