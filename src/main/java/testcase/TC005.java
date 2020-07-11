package testcase;

import org.testng.annotations.Test;

import utilis.DP005;
import wrappers.ProjectWrappers;

public class TC005  extends ProjectWrappers {
	@Test(dataProvider="fetchData",dataProviderClass=DP005.class)

	public void FormCFrro(String Name, String pwd, String conPwd, String secQn,
			
			String secans, String name, String gen, String dob, String desig, String email, String mbno, String phno, String nation, String hotelname,
			
			String cap,String hoteladdress,  String hotelstate, String hotelcity, String accomadationtype, String grade, String hotelmailid, String hotelmbno, String hotelphno,
			
			String name1, String add1, String state1, String dist1, String mail1,	String ph1, String mb1,
			
			String name2, String add2, String state2, String dist2, String mail2, String ph2, String mb2,
			
			String name3, String add3, String state3, String dist3, String mail3,
			String ph3, String mb3)
	{
		
		int sq=Integer.parseInt(secQn);
		int gender=Integer.parseInt(gen);
		clickByXpath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a");
		waitProperty(4000);
		enterById("u_id", Name);
		enterById("u_pwd", pwd);
		enterById("u_repwd", conPwd);
		waitProperty(4000);
		selectByxpath("//*[@id='u_secques']", sq);
		waitProperty(4000);
		enterById("u_secans", secans);
		enterById("u_name", name);
		waitProperty(4000);
		selectByxpath("//*[@id='u_gender']", gender);
		waitProperty(4000);
		enterById("u_dob", dob);
		enterById("u_designation", desig);
		enterById("u_emailid", email);
		enterById("u_mobile", mbno);
		enterById("u_phone", phno);
		waitProperty(4000);
		selectVisibileTextById("u_nationality", nation);
		waitProperty(4000);
		enterById("name", hotelname);
		enterById("capacity", cap);
		enterById("address", hoteladdress);
		waitProperty(4000);
		selectVisibileTextById("state",  hotelstate);
		waitProperty(4000);
		selectVisibileTextById("city_distr", hotelcity);
		waitProperty(4000);
		selectVisibileTextById("acco_type", accomadationtype);
		waitProperty(4000);
		selectVisibileTextById("star_rat", grade);
		waitProperty(4000);
		enterById("email", hotelmailid);
		enterById("mcontact", hotelmbno);
		enterById("contact", hotelphno);
		waitProperty(4000);
			enterByName("name_o", name1);
		enterByName("address_o", add1);
		waitProperty(4000);
		selectVisibileTextById("state_o",  state1);
		waitProperty(4000);
		selectVisibileTextById("citydistr_o", dist1);
		waitProperty(4000);
		enterByName("emailid_o", mail1);
		enterByName("phoneno_o", ph1);
		enterByName("mobile_o", mb1);
		clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
		waitProperty(4000);
		enterByName("name_o", name2);
		enterByName("address_o", add2);
		waitProperty(4000);
		selectVisibileTextById("state_o",  state2);
		waitProperty(4000);
		selectVisibileTextById("citydistr_o", dist2);
		waitProperty(4000);
		enterByName("emailid_o", mail2);
		enterByName("phoneno_o", ph2);
		enterByName("mobile_o", mb2);
		waitProperty(4000);
				clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
		waitProperty(4000);
		enterByName("name_o", name3);
		enterByName("address_o", add3);
		waitProperty(4000);
		selectVisibileTextById("state_o",  state3);
		waitProperty(4000);
		selectVisibileTextById("citydistr_o", dist3);
		waitProperty(4000);
		enterByName("emailid_o", mail3);
		enterByName("phoneno_o", ph3);
		enterByName("mobile_o", mb3);
		clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
		waitProperty(4000);
		
		}
}
