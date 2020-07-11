package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP008 {
	
	
	@DataProvider(name="fetchCoachTrain")
	public static String[][] coachTrain() throws IOException
	{
		String testData[][];
		FileInputStream file=new FileInputStream("./testData/TC008.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int noofrow=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		 
		
		testData=new String[noofrow][col];
		
		for(int i=1;i<=noofrow;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<col;j++)
			{
				String celldata=row.getCell(j).getStringCellValue();
				System.out.println("The Value of Row"+i+" and Column "+j+" is: "+celldata);
				testData[i-1][j]=celldata;
			}
		}
		
	
		
		return testData;
	}

}
