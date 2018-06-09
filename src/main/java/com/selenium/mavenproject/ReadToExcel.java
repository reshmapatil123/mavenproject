package com.selenium.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadToExcel {

	public static void main(String[] args) throws IOException {
		
		
	    File f=new File("resources/ExcelSele.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook ex= new XSSFWorkbook(fis);
		XSSFSheet sh=ex.getSheet("selenium");
		
		int rows=sh.getPhysicalNumberOfRows();//2 gives rows no.
		System.out.println("====="+rows);
		for(int i=0;i<rows;i++)
		{
			String Username=sh.getRow(i).getCell(0).getStringCellValue();
			String Password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Username);
			System.out.println(Password);
			
		}		
		
		
		ex.close();
		fis.close();
		

	}

}
