package org.test;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTest {
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
		Thread.sleep(3000);
		WebElement sl = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[2]"));
		ac.clickAndHold(sl).moveByOffset(178,408).release().build().perform();




		//		TakesScreenshot ts=(TakesScreenshot)driver;
		//		File f=ts.getScreenshotAs(OutputType.FILE);
		//		File f1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Screenshot\\flipkartMi.png");
		//		FileUtils.copyFile(f,f1);
	}
	//		Thread.sleep(3000);
	//		WebElement redmi = driver.findElement(By.xpath("//div[text()='Redmi 8 (Onyx Black, 64 GB)']"));
	//		redmi.click();
	//		WebElement txtuser = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	//		txtuser.sendKeys("9629805550");
	//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	//		pass.sendKeys("shanmugam");	

}
