package com.zeidler.test.seleniumFunctions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zeidler.test.constants.Constants;

import junit.framework.Assert;

public class ProductLogin {

	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public void createDriver() throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", Constants.DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(Constants.APP_URL);
		waitVar = new WebDriverWait(driver, 15);		
	}

	

}
