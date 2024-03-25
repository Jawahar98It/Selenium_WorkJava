package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class challenge1 {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\sampledata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fis);
		Sheet mysheet =book.getSheet("programs");
		Row myrow =mysheet.getRow(1);
		Cell mycell=myrow.getCell(0);
		System.out.println("Retriving Data from excel workbook is: "+mycell);

	}

}
