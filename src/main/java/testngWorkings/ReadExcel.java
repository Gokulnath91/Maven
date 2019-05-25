package testngWorkings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] ReadExcelData(String fileName1) throws InvalidFormatException, IOException {
		XSSFWorkbook CreateLeadFile = new XSSFWorkbook (new File("./Data/"+fileName1+".xlsx"));
		XSSFSheet CreateLeadSheet = CreateLeadFile.getSheetAt(0);
		int NumberOfRows = CreateLeadSheet.getLastRowNum();
		int lastCellNum = CreateLeadSheet.getRow(0).getLastCellNum();
		String[][] data = new String[NumberOfRows][lastCellNum];

		for (int i = 1; i <= NumberOfRows; i++) {
			//XSSFRow row = CreateLeadSheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
			//	XSSFCell cell = row.getCell(j);
				data [i-1][j] = CreateLeadSheet.getRow(i).getCell(j).getStringCellValue();			
			}
		}
		CreateLeadFile.close();
		return data;
	}

}
