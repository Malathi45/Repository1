package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DP007 {
	@DataProvider(name="fetchData")
	public static String[][]  charterData() throws IOException
	{
		
		String testData[][];
		
		FileInputStream fi=new FileInputStream("./testData/TC007.xlsx");
		
		XSSFWorkbook book=new  XSSFWorkbook(fi);
		
		XSSFSheet sheet=book.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
	 int colcount=sheet.getRow(0).getLastCellNum();
	 
	 testData=new String [rowcount][colcount];
	 
	 
	 for(int i=1;i<=rowcount;i++)
		 
	 {
		 XSSFRow row=sheet.getRow(i);
		 
		 for(int j=0;j<colcount;j++)
		 {
			String celldata= row.getCell(j).getStringCellValue();
			System.out.println("The Value of Row"+i+" and Column "+j+" is: "+celldata);
			testData[i-1][j]=celldata;
		 }
	 }
		
	 
	 
	 
		return testData;
		
	}

}
