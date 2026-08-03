package working_with_excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataSingleCell 
{

	public static void main(String[] args) throws IOException 
	{
		File file = new File("D:\\QT\\QT_233_234 Selenium\\Excel Operations\\WriteDataSingleCell.xlsx");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("MySheet");
		
		XSSFRow row = sheet.createRow(5);
		
		XSSFCell cell = row.createCell(5);
		
		cell.setCellValue("Hello World");
		
		System.out.println("Data Written successfully");
		
		workbook.write(fos);
		
		workbook.close();
	}

}
