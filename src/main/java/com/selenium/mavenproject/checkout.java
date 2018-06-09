package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkout {
	WebDriver webpage;
	public checkout(WebDriver webpage2) {
		webpage=webpage2;
	}
	public void CheckoutFunction() {
		
		 WebElement proceed = webpage.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		    proceed.click();
		    
		  
	}

}
