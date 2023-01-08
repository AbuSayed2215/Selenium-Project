package com.excelutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
public static void excelData () throws IOException {
	FileInputStream read = new FileInputStream("./TestData/TestData.xlsx");	
	XSSFWorkbook workbook = new XSSFWorkbook(read);
	XSSFSheet sheet = workbook.getSheet("sheet1");
	
	//Iterator<Row> iterator = sheet.iterator();
	//Iterator.next();
	
	List<String> list = new ArrayList();
	
	
	

}

}
