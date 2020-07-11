package testcase;

import org.testng.annotations.Test;

import utilis.DP004;
import wrappers.ProjectWrappers;

public class TC004  extends ProjectWrappers {
	@Test(dataProvider="searchmobile", dataProviderClass=DP004.class)
	public void flipkart(String Username,String Password,String MobileName)
	{
		
		waitProperty(3000);
		enterByXpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", Username);
		waitProperty(3000);
	enterByXpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", Password);
	waitProperty(3000);
	clickByXpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	waitProperty(2000);
	enterByName("q", MobileName);
	
	waitProperty(4000);
	clickByXpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
	
	waitProperty(4000);
	clickByXpath("(//a[@target='_blank'])[1]");
	waitProperty(4000);
	switchToLastWindow();
	waitProperty(2000);
	String beforeaddtocart_price=getTextByXpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]");
	waitProperty(2000);
	String afteraddtocart_title=getTextByXpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/h1/span");
	waitProperty(2000);
	clickByXpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	waitProperty(4000);

	verifyTextByXpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/a",afteraddtocart_title);
	
	waitProperty(2000);
	verifyTextByXpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/span",beforeaddtocart_price);
	waitProperty(2000);
	clickByXpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]");

	waitProperty(4000);
	clickByXpath("//*[@id='container']/div/div[1]/div/div[3]/div/div[2]");
	waitProperty(4000);
	}

}
