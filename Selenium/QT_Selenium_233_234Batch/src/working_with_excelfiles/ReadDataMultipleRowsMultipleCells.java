package working_with_excelfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataMultipleRowsMultipleCells {

	public static void main(String[] args) throws IOException {
XSSFWorkbook workbook = new XSSFWorkbook();
		
		String filepath="D:\\QT\\QT_233_234 Selenium\\Excel Operations\\SwalabsLoginTestData.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		//XSSFSheet sheet = workbook.getSheet("SWagLoginPageTestData");
		
		//Rows:OuterLoop
		
		//for(int i=0;i<5;i++)
		for(int i=0; i<sheet.getLastRowNum(); i++)  //Outer Loop
		{
			XSSFRow row = sheet.getRow(i);  //00 01 10 11 20 21
		
		for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++)  //Inner Loop
		{
						
			XSSFCell cell = row.getCell(j);
			
			String data = cell.getStringCellValue();
			//double data = cell.getNumericCellValue();
			//System.out.println(data);
			System.out.print(data +" || ");
		}
		System.out.println();
		}
		
			workbook.close();
			fis.close();
	}

}
