package excelDataDriven;

import java.util.Hashtable;

import demogroup.SampleProject.BaseTest;

public class DataUtils extends BaseTest
{
	
	public static Object[][] getTestData(ExcelAPI e, String sheetName, String testCaseName) throws Exception
	{
		
		System.out.println("TestName is : " + testCaseName);
		
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test Starts from row : " + testStartRowNum);
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2; 
		
		//calculate Rows of Data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are : " + rows);
		
		
		//calculate total columns
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total Cols are : " + cols);
		
		
		//read the test data
		int dataRow = 0;
		Object[][] data = new Object[rows][1];
		
		Hashtable<String, String> table = null;
		
		for(int rNum = dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table = new Hashtable<String, String>();
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.print(e.getCellData(sheetName, cNum, rNum) + "  ");
				//data[dataRow][cNum]= e.getCellData(sheetName, cNum, rNum);
				String key = e.getCellData(sheetName, cNum, colStartRowNum);
				String value = e.getCellData(sheetName, cNum, rNum);
				table.put(key, value);
			}
			System.out.println();
			data[dataRow][0]= table;
			dataRow++;
		}
		return data;
	}

}
