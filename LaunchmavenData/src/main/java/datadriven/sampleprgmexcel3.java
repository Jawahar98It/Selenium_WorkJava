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

public class sampleprgmexcel3 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\company.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet mysheet = book.getSheet("demodata");

		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
			Row myrow = mysheet.getRow(i);
			for (int j = 0; j < myrow.getPhysicalNumberOfCells(); j++) {
				Cell mycell = myrow.getCell(j);
				int celltype = mycell.getCellType();

				if (celltype == 1) {
					String celldata = mycell.getStringCellValue();
					System.out.println(celldata);
				}

				else if (DateUtil.isCellDateFormatted(mycell)) {
					Date mydate = mycell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-YY");
					String value = s.format(mydate);
					System.out.println(value);
				}
				else
				{
					double numbervalue =mycell.getNumericCellValue();
					long l = (long) numbervalue;
					String value1=String.valueOf(l);
					System.out.println(value1);
				}
			}
		}
	}

}
