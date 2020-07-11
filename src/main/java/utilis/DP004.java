package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP004 {

	@DataProvider(name="searchmobile")
	public static String[][] searchMobile() throws IOException
	{

		String testData[][];
		FileInputStream file=new FileInputStream("./testData/TC004.xlsx");

		XSSFWorkbook book=new XSSFWorkbook(file);

		XSSFSheet sheet=book.getSheetAt(0);

		int noofrow=sheet.getLastRowNum();
		int noofcol=sheet.getRow(0).getLastCellNum();
		testData=new String[noofrow][noofcol];
		for(int i=1;i<=noofrow;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<noofcol;j++)
			{
			String cell=row.getCell(j).getStringCellValue();
				testData[i-1][j]=cell;
			}
		}

		return testData;
	}

}
