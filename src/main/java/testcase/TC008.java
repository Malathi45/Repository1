package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilis.DP008;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@Test(dataProvider="fetchCoachTrain", dataProviderClass=DP008.class)
	public void coachTrain(String userId,String password,String cnfPassword,String secQstn,String secAnswer, String email, String occupation,String fname, 
			String mname,  String lname,String natinality, String flatNo, String street, String area,String country, String mobile, String pincode, String postOffice){
	
		int secQN=Integer.parseInt(secQstn);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
		waitProperty(4000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(5000);
		switchToParentWindow();
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/ul/li[3]/a/span");
		switchToLastWindow();
		clickByXpath("//a[@data-activates='slide-out']");
		waitProperty(2000);
		
		clickByLink("Book Your Coach/Train");
		waitProperty(4000);
		switchToLastWindow();
		
		
		clickByXpath("//*[@id='planner']/table/tbody/tr[4]/td[2]/div/a[2]");
		waitProperty(4000);
		enterById("userId", userId);
		waitProperty(5000);
		enterById("password",password);
		waitProperty(5000);
		enterById("cnfPassword", cnfPassword);
		selectIndexById("secQstn", secQN);
		waitProperty(5000);
		enterById("secAnswer", secAnswer);
		waitProperty(4000);
		enterByXpath("//*[@id='dateOfBirth']", "20/01/1997");
		waitProperty(4000);
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a");
		waitProperty(4000);
		clickByXpath("//*[@id='gender1']");
		waitProperty(4000);
		
		clickByXpath("//*[@id='maritalStatus1']");
		waitProperty(4000);

		enterById("email", email);
		waitProperty(2000);
		selectVisibileTextById("occupation",occupation);
		waitProperty(2000);
		enterById("fname", fname);
		waitProperty(4000);

		enterById("mname", mname);
		waitProperty(2000);
		enterById("lname", lname);
		waitProperty(4000);

		selectVisibileTextById("natinality", natinality);
		waitProperty(4000);
		enterById("flatNo", flatNo);
		waitProperty(4000);

		enterById("street", street);
		enterById("area", area);
		selectVisibileTextById("country", country);
		waitProperty(4000);
		enterById("mobile", mobile);
		waitProperty(4000);

		enterById("pincode",pincode);
		waitProperty(4000);
		selectVisibileTextById("postOffice", postOffice);
		waitProperty(4000);
	

		
	}

	

}