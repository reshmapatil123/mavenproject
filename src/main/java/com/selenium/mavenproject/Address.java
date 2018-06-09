package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Address {
    WebDriver webpage;
	public Address(WebDriver webpage2) {
		webpage=webpage2;
	}
	public void addressfunction() {
		
		WebElement address = webpage.findElement(By.xpath("//button[@name='processAddress']"));
	    address.click();
	    
	    WebElement chkbox = webpage.findElement(By.xpath("//div[@id='uniform-cgv']"));
	    chkbox.click();
	}
}
