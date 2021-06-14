package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWriterByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFFont font = wb.createFont();
		XSSFCellStyle style = wb.createCellStyle();
		
		font.setFontName("Algerian");
		font.setFontHeight(14.0);
		font.setBold(true);
		style.setFont(font);
		
		
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(3);
		XSSFCell cell = row.getCell(4);
		
		cell.setCellStyle(style);
		cell.setCellValue("Failed");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\testdata2.xlsx") ;
		wb.write(fos);
		wb.close();
		fos.close();
		
	}

}
