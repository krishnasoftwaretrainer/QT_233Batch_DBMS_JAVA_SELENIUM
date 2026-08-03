package working_with_excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleSheets 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
File file = new File("D:\\QT\\QT_233_234 Selenium\\Excel Operations\\MultipleSheetsCreation.xlsx");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet1 = workbook.createSheet("MySheet1");
		Thread.sleep(2000);
		XSSFSheet sheet2 = workbook.createSheet("MySheet2");
		Thread.sleep(2000);
		XSSFSheet sheet3 = workbook.createSheet("MySheet3");
		Thread.sleep(2000);
		XSSFSheet sheet4 = workbook.createSheet("MySheet4");
		Thread.sleep(2000);
		XSSFSheet sheet5 = workbook.createSheet("MySheet5");
		Thread.sleep(2000);
		System.out.println("Sheets created successfully");
		
		workbook.write(fos);
		
		workbook.close();

	}

}
