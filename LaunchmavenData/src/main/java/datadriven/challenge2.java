package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class challenge2 {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\sampledata.xlsx");
		FileInputStream Fis = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(Fis);
		Sheet sheet =book.getSheet("programs");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row myrow=sheet.getRow(i);
			
			for (int j = 0; j < myrow.getPhysicalNumberOfCells(); j++) 
			{
				Cell mycell=myrow.getCell(j);
				System.out.println(mycell);
			}
		}

	}

}
