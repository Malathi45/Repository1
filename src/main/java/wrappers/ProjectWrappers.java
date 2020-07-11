package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectWrappers extends GenericWrappers {
	
	@BeforeMethod
	public void launchBrowser()
	{
	//invokeApp("chrome", "https://www.irctc.co.in/");
		invokeApp("chrome", "https://www.flipkart.com/");
	//invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		//invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");

	}
	@AfterMethod
	public void closeBrowser()
	{
		//closeAllBrowsers();
	}

}
