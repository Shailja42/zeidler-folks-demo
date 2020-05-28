package com.zeidler.test.seleniumFunctions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zeidler.test.constants.Constants;

import junit.framework.Assert;

public class ProductUpdationPage {

	WebDriver driver = ProductLogin.driver;
	WebDriverWait waitVar = ProductLogin.waitVar;

	public void edit_product() throws InterruptedException {
		waitVar = new WebDriverWait(driver, 20);
		System.out.println(Constants.computer_name);
		driver.findElement(By.xpath("//*[contains(text(),'" + Constants.computer_name + "')]")).click();
		driver.findElement(By.id("name")).sendKeys("edited");
		driver.findElement(By.id("introduced")).clear();
		driver.findElement(By.id("introduced")).sendKeys("2018-09-01");
		driver.findElement(By.id("discontinued")).clear();
		driver.findElement(By.id("discontinued")).sendKeys("2069-02-02");
		driver.findElement(By.id("company")).click();
		Select con = new Select(driver.findElement(By.id("company")));
		con.selectByIndex(2);
		driver.findElement(By.xpath("//input[@class='btn primary' and @value='Save this computer']")).click();
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert-message warning']")));		
		String s = Constants.computer_name+"edited";
			String expected = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		String actual=Constants.CREATION_SUCCESS_MSG+s+Constants.UPDATE_SUCCESS_MSG_END; 
		Assert.assertEquals(expected,actual );
		driver.findElement(By.id("searchbox")).sendKeys(Constants.computer_name);
		driver.findElement(By.id("searchsubmit")).click();	
		driver.findElement(By.xpath("//*[contains(text(),'"+s+"')]"));			
		driver.quit();
	}

}
