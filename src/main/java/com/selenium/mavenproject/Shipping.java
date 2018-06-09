package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {
	WebDriver webpage;
     public Shipping(WebDriver webpage2) {
    	 webpage=webpage2;
     }
	public void shippingFunction() {
    	 WebElement shipping = webpage.findElement(By.xpath("//button[@name='processCarrier']"));
		    shipping.click();
		    	
}

}
