package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void LoadUrl(String url) {
		driver.get(url);
	}
	public static void PageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void PageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void fill(WebElement e,String value) {
		e.sendKeys(value);
	}
}
