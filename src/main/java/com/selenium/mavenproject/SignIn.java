package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	WebDriver webpage;
	public SignIn(WebDriver webpage2) {
		webpage=webpage2;
	}
	public void signINfunction()
	{
			WebElement signin = webpage.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
    signin.click();
	}
}
