package com.zeidler.test.seleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListing {
	WebDriver driver = ProductLogin.driver;
	WebDriverWait waitVar = ProductLogin.waitVar;

	public void list_product() throws InterruptedException {
		
		WebElement table = driver.findElement(By.xpath("//table[@class='computers zebra-striped']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (WebElement cell : cells) {

				System.out.println(cell.getText());
			}
		}
		driver.quit();
	}
}
