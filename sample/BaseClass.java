package org.sample;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void Maxi() {
		driver.manage().window().maximize();
	}
	public static void LoadUrl(String url) {
		driver.get(url);
	}
	public static void pageTitle() {
		driver.getTitle();
	}
	public static void pageUrl() {
		driver.getCurrentUrl();
	}
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
public static String getData(int rowNo, int cellNo) throws IOException {
	String value="";
	File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Excel\\Student.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w =new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Data");
	Row r = s.getRow(rowNo);
	Cell c = r.getCell(cellNo);
	int cc = c.getCellType();
	if (cc==1) {
		value = c.getStringCellValue();
	} else 
		if (cc==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyy");
				value = sim.format(d);
			} else {
				double d = c.getNumericCellValue();
				long l=(long) d;
				value = String.valueOf(l);
			}
		} 	
	return value;
}
}


