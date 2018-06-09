package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver webpage;
	
	public login(WebDriver webpage2) {
			webpage=webpage2;
	}

	public void loginpage(){
		
		 WebElement regi=webpage.findElement(By.id("email"));
		 regi.sendKeys("reshmapatil027@gmail.com");
		 WebElement pass=webpage.findElement(By.id("passwd"));
		 pass.sendKeys("reshma");
		 webpage.findElement(By.id("SubmitLogin")).click();
		
	}

}
