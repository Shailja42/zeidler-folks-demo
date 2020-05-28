package com.zeidler.test.seleniumFunctions;

import java.net.MalformedURLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zeidler.test.constants.Constants;

import junit.framework.Assert;

public class ProductCreationPage {
	ProductLogin obj = new ProductLogin();

	WebDriver driver = ProductLogin.driver;
	WebDriverWait waitVar = ProductLogin.waitVar;

	public void createprdct() throws MalformedURLException, InterruptedException {
		waitVar = new WebDriverWait(driver, 20);
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/']")));
		Random obj = new Random();
		int randomNumber = obj.nextInt(100);
			
		driver.findElement(By.id("add")).click();
		Random randomNo = new Random();
		int number = randomNo.nextInt(100);
		Constants.computer_name = "My_Comp"+number;
		driver.findElement(By.id("name")).sendKeys(Constants.computer_name);	
		driver.findElement(By.id("introduced")).sendKeys("2017-09-07");
		driver.findElement(By.id("discontinued")).sendKeys("2060-01-02");
		driver.findElement(By.id("company")).click();
		Select con = new Select(driver.findElement(By.id("company")));
		con.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class='btn primary' and @value='Create this computer']")).click();
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert-message warning']")));		
	}

	public void verifyprdct() {
		String expected = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		String actual=Constants.CREATION_SUCCESS_MSG+Constants.computer_name+Constants.CREATION_SUCCESS_MSG_END; 
		Assert.assertEquals(expected,actual );
		driver.findElement(By.id("searchbox")).sendKeys(Constants.computer_name);
		driver.findElement(By.id("searchsubmit")).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+Constants.computer_name+"')]")).isDisplayed();
		driver.quit();
	}
	

}
