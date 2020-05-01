package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < 3; i++) {
			WebElement tRow = tRows.get(i);
			String txt = tRow.getText();
						System.out.println(txt);
			List<WebElement> tDats = tRow.findElements(By.tagName("td"));
			for (int j = 0; j < tDats.size(); j++) {
				WebElement tDat = tDats.get(j);
				String text = tDat.getText();
				if (text.equals("Albania")) {
					System.out.println(text);
					System.out.println("Row no : "+(i));
					System.out.println("Column no : "+(j));
				}
				//				System.out.println(text);
			}
		}
	}
}
