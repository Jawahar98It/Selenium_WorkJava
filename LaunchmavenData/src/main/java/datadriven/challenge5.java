package datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class challenge5 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\challenge4.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet newsheet = book.createSheet("Datas");
		Row newrow = newsheet.createRow(0);
		Cell newcell = newrow.createCell(0);
		newcell.setCellValue("Selenium");
		Cell newcell1 = newrow.createCell(1);
		newcell1.setCellValue("Java");
		Cell newcell2 = newrow.createCell(2);
		newcell2.setCellValue("Data Driven");
		Cell newcell3 = newrow.createCell(3);
		newcell3.setCellValue("POM");

		Row newrow1 = newsheet.createRow(1);
		Cell cell1 = newrow1.createCell(0);
		cell1.setCellValue("Appium");
		Cell cell2 = newrow1.createCell(1);
		cell2.setCellValue("Cucumber");
		Cell cell3 = newrow1.createCell(2);
		cell3.setCellValue("JUnit");
		Cell cell4 = newrow1.createCell(3);
		cell4.setCellValue("TestNG");

		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		fos.close();

		System.out.println("Excel file created successfully");
	}
}
