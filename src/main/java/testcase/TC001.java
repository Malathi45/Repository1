package testcase;


import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@Test
	public void sample()
	{
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]");
		waitProperty(9000);
		enterById("userName", "malathipalanisamy");
		waitProperty(9000);
		enterByName("usrPwd", "Malathimals9871");
		enterByName("cnfUsrPwd", "Malathimals9871");
		enterByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[4]/input", "answer");
		enterById("firstName", "Malathi");
		enterById("middleName", "mals");
		enterById("lastname", "mals");
		clickById("F");
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[1]/input");
		enterById("email", "malathimals97@gmail.com");
		enterById("mobile", "9876453322");
		enterById("resAddress1", "Yuvathi hostel,avenue road,nungampakkam");
		enterById("resAddress2", "avenue road");
		enterById("resAddress3", "nungampakkam");
		enterByName("resPinCode", "600034");
		enterById("resState", "Tamilnadu");
		enterById("resPhone", "8537393323");
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[18]/div[2]/input");
	}
	
	

}
