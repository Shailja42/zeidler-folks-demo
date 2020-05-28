package com.zeidler.test.seleniumFunctions;

import static org.junit.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.zeidler.test.seleniumFunctions.ProductCreationPage;

import com.zeidler.test.constants.Constants;

import junit.framework.Assert;

public class ProductDeletionPage {
	public static WebDriverWait waitVar = null;
	WebDriver driver = ProductLogin.driver;

	public void search_product() throws InterruptedException {
		driver.findElement(By.id("searchbox")).sendKeys(Constants.computer_name);
		driver.findElement(By.id("searchsubmit")).click();
	}

	public void delete_product() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(text(),'" + Constants.computer_name + "')]")).click();
		driver.findElement(By.xpath("//input[@class='btn danger']")).click();
	}

	public void verify_product() {
		String expected = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		Assert.assertEquals(expected, Constants.DELETION_SUCCESS_MSG);
		driver.findElement(By.id("searchbox")).sendKeys(Constants.computer_name);
		driver.findElement(By.id("searchsubmit")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Nothing to display')]")).isDisplayed();
			driver.quit();
	}

}