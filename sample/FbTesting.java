package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FbTesting extends BaserOne {
	public static void main(String[] args) throws IOException {
		openBrowser();
		launchBrowser("https://www.facebook.com/");
		pageTitle();
		WebElement txtEmail = driver.findElement(By.id("email"));
		fill(txtEmail, "Selenium");
		driver.navigate().refresh();
		WebElement txtEmail1 = driver.findElement(By.id("email"));
		fill(txtEmail1, "Java");
	}
}
