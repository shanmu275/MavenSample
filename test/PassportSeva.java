package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportSeva {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement dob = driver.findElement(By.xpath("//input[@value='DD/MM/YYYY']"));
		dob.click();
		WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(mon);
		s.selectByValue("5");
		WebElement yr = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(yr);
		s1.selectByVisibleText("1992");

		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement x : alldates) {
			String date=x.getText();
			if (date.equals("26")) {
				x.click();
				break;
			}
		}


		//		WebElement dt = driver.findElement(By.xpath("//a[text()='5']"));
		//		dt.click();
	}

}
