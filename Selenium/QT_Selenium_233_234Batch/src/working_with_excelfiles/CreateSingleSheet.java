package working_with_excelfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSingleSheet {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\QT\\QT_233_234 Selenium\\Excel Operations\\SingleSheetCreation.xlsx");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("MySheet");
		
		System.out.println("Sheet created successfully");
		
		workbook.write(fos);
		
		workbook.close();
		
	}

}
