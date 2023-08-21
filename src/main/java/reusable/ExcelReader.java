package reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

 
public class ExcelReader {
	
	@Test
	public void read() throws Exception {
		String filePath = "E:/Ashwini_Fusion_Institute/MOCK_Software_Testing_April._batch...xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0); // Replace '0' with the index of the sheet you want to read (0-based index).
		for (Row row : sheet) {
		    for (Cell cell : row) {
		        switch (cell.getCellType()) {
		            case STRING:
		                System.out.print(cell.getStringCellValue() + "\t");
		                break;
		            case NUMERIC:
		                System.out.print(cell.getNumericCellValue() + "\t");
		                break;
		            case BOOLEAN:
		                System.out.print(cell.getBooleanCellValue() + "\t");
		                break;
		            default:
		                System.out.print("\t");
		        }
		    }
		    System.out.println();
		}
		fis.close();
		workbook.close();
	}

}
