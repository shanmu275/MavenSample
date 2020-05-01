package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException  {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Excel\\student.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s = w.getSheet("data");
		int noOfRow = s.getPhysicalNumberOfRows();
		System.out.println(noOfRow);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cc = c.getCellType();
				if (cc==1) {
					String ss = c.getStringCellValue();
					System.out.println(ss);
				} else {
					if (cc==0) {
						if (DateUtil.isCellDateFormatted(c)) {
							Date d = c.getDateCellValue();
							SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
							String value = sim.format(d);
							System.out.println(value);
						} else {
							double d = c.getNumericCellValue();
							long l=(long)d;
							System.out.println(l);

						}
					} 		}
			}
		}
	}
}
