package datadriven;

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

public class challenge3data {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\challenge3.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook mybook = new XSSFWorkbook(fis);
		Sheet mysheet =mybook.getSheet("tasks");
		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) 
		{
			Row row =mysheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) 
			{
				Cell cell=row.getCell(j);
				int typecell=cell.getCellType();
				if(typecell == 1)
				{
					String alphavalue=cell.getStringCellValue();
					System.out.println(alphavalue);
				}
				else if(DateUtil.isCellDateFormatted(cell))
				{
					Date mydate=cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-YY");
					String datevalue=s.format(mydate);
					System.out.println(datevalue);
				}
				
				else
				{
					double numericvalue =	cell.getNumericCellValue();
					long l = (long) numericvalue;
					String number =String.valueOf(l);
					System.out.println(number);
				}
			}
		}

	}

}
