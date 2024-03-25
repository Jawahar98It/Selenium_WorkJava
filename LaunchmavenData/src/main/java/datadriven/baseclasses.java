package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class baseclasses 
{
	
	public static void createExcel(int rowNum,int cellNum,String newData) throws IOException 
	{
		File f = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\challenge5.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook newbook = new XSSFWorkbook();
		Sheet newsheet = newbook.createSheet("Datas");
		Row newrow = newsheet.createRow(rowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(newData);
		FileOutputStream fos =  new FileOutputStream(f);
		newbook.write(fos);

	}
	public static void createcell(int rowNum,int cellNum,String newData) throws IOException 
	{
		File f = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\challenge5.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook newbook = new XSSFWorkbook(fis);
		Sheet newsheet = newbook.getSheet("Datas");
		Row newrow = newsheet.getRow(rowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(newData);
		FileOutputStream fos =  new FileOutputStream(f);
		newbook.write(fos);

	}
	
	public static void createRow(int creRow,int creCell,String creStr) throws IOException 
	{
		File f = new File("E:\\Training_Selenium\\LaunchmavenData\\Excel\\challenge5.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet newsheet = wb.getSheet("Datas");
		Row newrow = newsheet.createRow(creRow);
		Cell newcell = newrow.createCell(creCell);
		newcell.setCellValue(creStr);
		FileOutputStream fos =  new FileOutputStream(f);
		wb.write(fos);

	}
	
	
	

	}
	
	

