package working_with_excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataMultipleRowsMultipleCells {

	public static void main(String[] args) throws IOException 
	{
	
		File file = new File("D:\\QT\\QT_233_234 Selenium\\Excel Operations\\WriteDataMultipleRowsMultipleCells.xlsx");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Numbers");
		
		XSSFRow row0 = sheet.createRow(0);  //First Row
		
		row0.createCell(0).setCellValue("One");
		row0.createCell(1).setCellValue("Two");
		row0.createCell(2).setCellValue("Three");
		row0.createCell(3).setCellValue("Four");
		row0.createCell(4).setCellValue("Five");
		
		XSSFRow row1 = sheet.createRow(1);  //Second Row
		row1.createCell(0).setCellValue("Eleven");
		row1.createCell(1).setCellValue("Twelve");
		row1.createCell(2).setCellValue("Thirteen");
		row1.createCell(3).setCellValue("Fourteen");
		row1.createCell(4).setCellValue("Fifteen");
		
		XSSFRow row2 = sheet.createRow(2);  //Third Row
		row2.createCell(0).setCellValue("Twenty One");
		row2.createCell(1).setCellValue("Twenty Two");
		row2.createCell(2).setCellValue("Twenty Three");
		row2.createCell(3).setCellValue("Twenty Four");
		row2.createCell(4).setCellValue("Twenty Five");
		
		XSSFRow row3 = sheet.createRow(3); //Fourth Row
		row3.createCell(0).setCellValue("Thirty One");
		row3.createCell(1).setCellValue("Thirty Two");
		row3.createCell(2).setCellValue("Thirty Three");
		row3.createCell(3).setCellValue("Thirty Four");
		row3.createCell(4).setCellValue("Thirty Five");
		
		XSSFRow row4 = sheet.createRow(4); //Fifth Row
		row4.createCell(0).setCellValue("Forty One");
		row4.createCell(1).setCellValue("Forty Two");
		row4.createCell(2).setCellValue("Forty Three");
		row4.createCell(3).setCellValue("Forty Four");
		//row4.createCell(4).setCellValue("Forty Five");
				
		System.out.println("Data Written successfully");
		
		workbook.write(fos);
		
		workbook.close();

	}

}
