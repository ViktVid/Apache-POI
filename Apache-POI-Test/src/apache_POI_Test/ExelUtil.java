package apache_POI_Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtil {
	
	private static XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	
	public static void loadWorkbook(String path) throws Exception {
		if (workbook != null) {
			throw new Exception ("Workbook already opened!");
		}
		
		workbook = new XSSFWorkbook(path);
	}
	
	public static void closeworkbook() throws Exception {
		if (workbook != null) {
			workbook.close();
			workbook = null;
			sheet = null;
		}
	}
	
	public static void setWorksheet (String name) {
		if (workbook != null) {
			sheet = workbook.getSheet(name);
		}
	}
	
	public static XSSFSheet getSheet() {
		return sheet;
	}
	
	public static String getDataAt(int row, int column) {
		if(sheet != null) {
		sheet.getRow(row).getCell(column).toString();
		}
		return " ";
	}
	
	public static int getRowNumber() {
		if(sheet != null) {
		return sheet.getLastRowNum()+1;
	}
		return 0;
	}
	
	public static void setDataAt(int row, int column, String data, String path) throws Exception {
		if (workbook != null && sheet != null) {
			XSSFRow xssfRow = null;
			if (row>sheet.getLastRowNum()) {
				xssfRow = sheet.createRow(row);
			} else {
				xssfRow = sheet.getRow(row);
			}
			XSSFCell cell = xssfRow.createCell(column);
			cell.setCellValue(data);
	//		FileOutputStream fos = new FileOutputStream(path);
			
		}
	}
}

