package working_with_excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SwagLoginTestData {

	public static void main(String[] args) throws IOException 
	{
File file = new File("D:\\QT\\QT_233_234 Selenium\\Excel Operations\\SwalabsLoginTestData.xlsx");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("SWagLoginPageTestData");
		
		XSSFRow row0 = sheet.createRow(0);  //First Row
		
		row0.createCell(0).setCellValue("UserName");
		row0.createCell(1).setCellValue("Password");
		
		XSSFRow row1 = sheet.createRow(1);  //First Row
		
		row1.createCell(0).setCellValue("standard_user");
		row1.createCell(1).setCellValue("secret_sauce");

		XSSFRow row2 = sheet.createRow(2);  //Second Row
		row2.createCell(0).setCellValue("standard_user");
		row2.createCell(1).setCellValue("invalid_pwd");
		
		XSSFRow row3 = sheet.createRow(3);  //Third Row
		row3.createCell(0).setCellValue("invalid_user");
		row3.createCell(1).setCellValue("standard_user");
		
		XSSFRow row4 = sheet.createRow(4); //Fourth Row
		row4.createCell(0).setCellValue("invalid_user");
		row4.createCell(1).setCellValue("invalid_pwd");

				
		System.out.println("Swag Login TestData Stored successfully");
		
		workbook.write(fos);
		
		workbook.close();

	}

}
