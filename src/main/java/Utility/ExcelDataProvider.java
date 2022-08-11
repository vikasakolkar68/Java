package Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static String getStringData(String sheetname,int row,int cell) throws Exception {
		
		String Path="C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Demo_Batch11\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(Path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
		
	}

}
