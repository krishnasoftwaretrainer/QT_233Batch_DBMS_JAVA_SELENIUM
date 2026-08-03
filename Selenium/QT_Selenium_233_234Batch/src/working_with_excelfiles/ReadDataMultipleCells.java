package working_with_excelfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataMultipleCells {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		String filepath="D:\\QT\\QT_233_234 Selenium\\Excel Operations\\WriteDataMultipleCells.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		//XSSFSheet sheet = workbook.getSheet("Numbers");
		
		//for(int i=0; i<7; i++)
		for(int i=0; i<sheet.getRow(0).getLastCellNum(); i++)
		{
			XSSFRow row = sheet.getRow(0);  //00 01 02 03 04
			
			XSSFCell cell = row.getCell(i);
			
			String data = cell.getStringCellValue();
			
			//System.out.println(data);
			System.out.print(data +" || ");
		}
		
		/*
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		
		System.out.println(data);
		
		XSSFCell cell1 = row.getCell(1);
		
		String data1 = cell1.getStringCellValue();
		
		System.out.println(data1);
		*/
		
		
		workbook.close();
		fis.close();

	}

}
