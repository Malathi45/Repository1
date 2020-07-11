package testcase;

import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	@Test
	public void BookHotelss()
	{
	
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/ul/li[3]/a/span");
		waitProperty(3000);
		switchToLastWindow();
		waitProperty(3000);
		selectVisibileTextByName("selPassangers", "3");
		switchToLastWindow();
		clickByXpath("/html/body/app-root/app-fulllayout/div/homeheader/nav/div/div[3]/a/a");
		waitProperty(3000);
	}

}
