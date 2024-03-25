package datadriven;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleprgmexcel {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\sampledata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet mysheet = book.getSheet("programs");
		Row ParticularRow = mysheet.getRow(2);
		Cell ParticularCell = ParticularRow.getCell(1);
		
		System.out.println(ParticularCell);
		
		 

	}

}
