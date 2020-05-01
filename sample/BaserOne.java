package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaserOne {
	public static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void launchBrowser(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void pageTitle() {
		driver.getTitle();
	}
}
