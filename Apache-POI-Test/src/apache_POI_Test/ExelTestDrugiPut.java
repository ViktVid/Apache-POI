package apache_POI_Test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelTestDrugiPut {

	public static void main(String[] args) throws IOException {

		
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\User\\Desktop\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("data");
		
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);
		
//		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getLastRowNum());
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell0 = row.getCell(0);
			XSSFCell cell1 = row.getCell(1);
			XSSFCell cell2 = row.getCell(2);
		
//			Osoba o = new Osoba (cell0.toString(), cell1.toString(), cell2.toString())
//			System.out.println(o);
			
			System.out.println(cell0.toString() + " - " + 
			cell1.toString() + " - " + cell2.toString());
		}
		
		workbook.close();
		
	}

}
