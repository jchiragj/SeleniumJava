package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String ProjectPath = System.getProperty("user.dir");
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;

	public static void main(String[] args) {
		getRowCount();
		getCellData();
	}

	public static void getRowCount() {

		try {

			workbook = new XSSFWorkbook(ProjectPath+"/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static void getCellData(){
		try {

			workbook = new XSSFWorkbook(ProjectPath+"/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}

