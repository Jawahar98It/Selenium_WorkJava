package datadriven;

import java.io.IOException;
import datadriven.baseclasses;

public class challenge6 extends baseclasses {

	public static void main(String[] args) throws IOException {
		createExcel(0, 0, "Selenium");
		createcell(0, 1, "Java");
		createcell(0, 2, "Data Driven");
		createcell(0, 3, "POM");
		
		createRow(1,0,"Appium");
		createcell(1,1,"Cucumber");
		createcell(1,2,"JUnit");
		createcell(1,3,"TestNG");

	}

}
