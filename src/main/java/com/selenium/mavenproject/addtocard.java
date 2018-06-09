package com.selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addtocard {
	WebDriver webpage;
public addtocard(WebDriver webpage2) {
		webpage=webpage2;
	}
public void addtocardfunction() throws InterruptedException{
	WebElement loginbtn= webpage.findElement(By.xpath("//a[text()='Women']"));
	loginbtn.click();
	WebElement select= webpage.findElement(By.xpath("//div[@id='subcategories']/ul/li[1]/div[1]/a"));
    select.click();
    WebElement img= webpage.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
    img.click();
    WebElement add= webpage.findElement(By.xpath("//span[text()='Add to cart']"));
    add.click();
    Thread.sleep(5000);
}
}
