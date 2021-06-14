package excelDataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReadingBycoloumNumber
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		String txt = cell.getStringCellValue();
		
		System.out.println(txt);
		
		wb.close();
		fis.close();
	}

}
