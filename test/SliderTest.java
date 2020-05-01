package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	
		close.click();
		WebElement elect = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions ac=new Actions(driver);

		ac.moveToElement(elect).perform();

		WebElement mob = driver.findElement(By.xpath("(//a[text()='Mi'])[1]"));
		mob.click();
		String s = driver.getCurrentUrl();
		if (s.equals("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi")){
			System.out.println(" You are in Mi Page ");
		} else {
			System.out.println("You are not in Mi Page");
		} 
//		WebElement sl = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']"));
//		ac.clickAndHold(sl).moveByOffset(192,404).release().build().perform();
}
}