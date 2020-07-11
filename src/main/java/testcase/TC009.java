
package testcase;

import org.testng.annotations.Test;

import utilis.DP009;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@Test(dataProvider="IrctcSignUp", dataProviderClass=DP009.class)
	public void irctcSignUp(String userName,String usrPwd,String cnfPwd, String secans, String Fname, String mname,String LName,
			String Gender,String dob ,String country,String email,String mobile,String Nationality,String resAddress1,String resAddress2,String resAddress3,String resPinCode,
			String resState,String City,String PostOffice,String Phone){
			
	
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
		waitProperty(2000);

		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]");
		waitProperty(4000);

		enterById("userName",userName);
		waitProperty(2000);
		enterById("usrPwd", usrPwd);
		waitProperty(2000);
		enterById("cnfUsrPwd", cnfPwd);
		waitProperty(4000);
		clickByXpath("//*[@id='corover-close-btn']");
		waitProperty(2000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[2]/p-dropdown/div/label");
		waitProperty(2000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]/span");
		waitProperty(5000);
		enterByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[4]/input", secans);
		waitProperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[5]/div[2]/p-dropdown/div/label");;
		waitProperty(3000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[5]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]/span");
		waitProperty(5000);
		enterById("firstName", Fname);
		waitProperty(3000);
		enterById("middleName", mname);
		waitProperty(3000);
		enterById("lastname",LName);
		waitProperty(3000);
		clickById(Gender);
		waitProperty(3000);
		enterByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/input", dob);

		waitProperty(4000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[4]/p-dropdown/div/label");
		
		waitProperty(4000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[4]/p-dropdown/div/div[4]/div/ul/li[6]/span");
		selectByXpathValue("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[11]/div[2]/select", country);
		waitProperty(4000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[2]/input");
		enterById("email", email);
		enterById("mobile", mobile);
		waitProperty(4000);
	
		selectByxpathVal("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[12]/div[5]/select", Nationality);
		waitProperty(4000);
		enterByName("resAddress1", resAddress1);
		enterByName("resAddress2", resAddress2);
		waitProperty(2000);
		enterByName("resAddress3",resAddress3);
		waitProperty(2000);
		enterByName("resPinCode", resPinCode);
		waitProperty(2000);
		enterByName("//*[@id='resState']",resState);
	
	
		waitProperty(4000);
		//enterTabByXpath("//*[@id='resState']");
		waitProperty(4000);
		selectVisibiletextByXpathValue("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[19]/div[5]/div[2]/select", City);
		waitProperty(4000);
		selectByxpathVal("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[19]/div[5]/div[4]/select", PostOffice);
		enterById("resPhone",Phone);
		waitProperty(2000);
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[18]/div[2]/input");
		waitProperty(4000);
		clickByXpath("//b[text()='Back']");
			
	}

	

	
	
}
