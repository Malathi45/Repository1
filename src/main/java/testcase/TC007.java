package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilis.DP007;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	
	@Test (dataProvider="fetchData", dataProviderClass=DP007.class )
	public void saloonMandatoryCheck(String Username,String organization, String address,String mobile, String email, 
			String requestFor, String originStation, String destnStation, String durationPeriod, String coachDetails,String numPassenger,
			String numPassenger1,String charterPurpose, String services)
	
	{
				clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
		waitProperty(3000);
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/ul/li[3]/a/span");
		waitProperty(3000);
		switchToLastWindow();
		clickByXpath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]");
		waitProperty(3000);
		clickByXpath("//*[@id='slide-out']/ul/li/ul/li[14]/a");
		waitProperty(3000);
		clickByXpath("//*[@id='Enquiry-tab-just']");
		waitProperty(3000);
		enterByName("name", Username);
		waitProperty(3000);
		enterByName("organization",organization);
		waitProperty(3000);
		enterByName("address", address);
		waitProperty(3000);
		enterByName("mobile", mobile);
		enterByName("email", email);
		waitProperty(3000);
		selectVisibileTextByName("requestFor",requestFor);
		enterByName("originStation", originStation);
		waitProperty(3000);
		enterByName("destnStation", destnStation);
		waitProperty(3000);
		clickByXpath("//*[@id='Enquiry-just']/div/form/div/div[11]/input");
		waitProperty(3000);
		clickByXpath("//*[@id='Enquiry-just']/div/form/div/div[11]/div/div/table/tbody/tr[5]/td[5]/span");
		waitProperty(3000);
		clickByName("checkOutDate");
		waitProperty(3000);
		clickByXpath("//*[@id='Enquiry-just']/div/form/div/div[12]/div/div/table/tbody/tr[5]/td[7]/span");
		waitProperty(3000);
		enterByName("durationPeriod", durationPeriod);
		waitProperty(3000);
		enterByName("coachDetails", coachDetails);
		waitProperty(3000);
		enterByXpath("//*[@id='Enquiry-just']/div/form/div/div[15]/input", numPassenger);
	      
		waitProperty(3000);
		enterByName("numPassenger", numPassenger1);
		waitProperty(3000);
		enterByName("charterPurpose", charterPurpose);
		enterByName("services", services);
		waitProperty(3000);
		clickByXpath("//*[@id='corover-close-btn']");
		waitProperty(3000);
		clickByXpath("//*[@id='Enquiry-just']/div/form/div/div[19]/button");
		waitProperty(3000);
		verifyTextByXpath("//*[@id='Enquiry-just']/div/form/div/div[6]/span", "Mobile no not valid.");
		
	}
}
