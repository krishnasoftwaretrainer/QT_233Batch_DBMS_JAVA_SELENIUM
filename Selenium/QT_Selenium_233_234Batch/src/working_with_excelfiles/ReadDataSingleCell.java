package working_with_excelfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataSingleCell {

	public static void main(String[] args) throws IOException
		{
		
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	String filepath="D:\\QT\\QT_233_234 Selenium\\Excel Operations\\WriteDataSingleCell.xlsx";
	
	FileInputStream fis = new FileInputStream(filepath);
	
	workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	//XSSFSheet sheet = workbook.getSheet("MySheet");
	
	XSSFRow row = sheet.getRow(5);
	
	XSSFCell cell = row.getCell(5);
	
	String data = cell.getStringCellValue();
	
	System.out.println(data);
	
	fis.close();
	workbook.close();
		
	}

}
