package working_with_excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataMultipleCells {

	public static void main(String[] args) throws IOException {
File file = new File("D:\\QT\\QT_233_234 Selenium\\Excel Operations\\WriteDataMultipleCells.xlsx");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Numbers");
		
		XSSFRow row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("One");
		row.createCell(1).setCellValue("Two");
		row.createCell(2).setCellValue("Three");
		row.createCell(3).setCellValue("Four");
		row.createCell(4).setCellValue("Five");
		
		System.out.println("Data Written successfully");
		
		workbook.write(fos);
		
		workbook.close();

	}

}
