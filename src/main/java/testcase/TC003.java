package testcase;

import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{


			@Test
			public void BookHotelss()
			{
				
				clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
				clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
				waitProperty(3000);
				clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/ul/li[3]/a/span");
				switchToLastWindow();
				waitProperty(3000);
				clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[3]/a[3]");
				switchToLastWindow();
				clickByXpath("/html/body/app-root/app-fulllayout/div/homeheader/nav/div/div[3]/a/a");
				waitProperty(3000);
				clickByXpath("//*[@id='LoginFormPopup']/app-loginmodal/div/div/div/ul/li[2]/a");
				waitProperty(3000);
				enterByName("email", "malathimals97@gmail.com");
				enterById("modalLRInput13", "8754232022");
				clickByXpath("//*[@id='panel8']/div[1]/form/div[3]/button");
				waitProperty(5000);
				enterByXpath("//*[@id='TravellerEconomydropdown']/div[1]/searchbox/input", "Madurai");
				waitProperty(5000);
				clickByXpath("//*[@id='TravellerEconomydropdown']/div[1]/searchbox/div/ul/li/a/div[1]/span");
				waitProperty(5000);
				clickByXpath("//*[@id='TravellerEconomydropdown']/div[2]/input");
				waitProperty(5000);
				clickByXpath("//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[6]/span");
				waitProperty(3000);
				clickByXpath("//*[@id='TravellerEconomydropdown']/div[3]/input");
				waitProperty(3000);
				clickByXpath("//*[@id='owl-dt-picker-1']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[6]/td[1]/span");
				waitProperty(3000);
				clickByName("guest");
				waitProperty(2000);
				selectIndexByName("hotelRoom", 1);
				waitProperty(2000);
				selectIndexByName("hotelAdult", 3);
				waitProperty(2000);
				clickByXpath("//*[@id='user-data-wrapper']/div[2]/button");
				waitProperty(2000);
				clickByXpath("//*[@id='TravellerEconomydropdown']/div[5]/button");
				waitProperty(5000);
				clickByXpath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button");
				waitProperty(2000);


				getTextByXpath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3/a");
				waitProperty(2000);
				getTextByXpath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/p");
				waitProperty(2000);

				clickByXpath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/div[4]/button");
				waitProperty(2000);
				selectIndexByName("title", 3);
				enterByName("firstName", "malathi");
				enterByName("lastName","palanisamy");
				waitProperty(4000);
				clearByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[4]/div/input");
				enterByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[4]/div/input", "8765432315");
				clearByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[5]/div/input");
				waitProperty(4000);
				enterByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[5]/div/input", "malathiamsl97@gmail.com");
				waitProperty(3000);


				selectVisibileTextByName("gst", "Yes");
				waitProperty(3000);

				enterByName("gstNumber", "29AAHCC812345K");
				waitProperty(2000);
				enterByName("companyName", "tierone");
				waitProperty(1000);
				enterByName("companyAddress", "Nungambakkam");
				waitProperty(4000);
				clickByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[10]/button[2]");
				waitProperty(4000);

				verifyTextByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[7]/div/span", "Please Enter Valid GSt number");

		

			}

		}
