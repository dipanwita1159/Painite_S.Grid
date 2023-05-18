package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;

import com.mohs10.ActionDriver.dataEncrypt_Decrypt2;
import com.mohs10.ActionDriver.dataMasking2;

import com.mohs10.or.HomePage;

public class CommonFuns extends Action {
	

	public static Action aDriver;
	public WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}

	public void login(String Userid, String Pwd) throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("login");
         //aDriver.navigateToApplication(url);   
		
		//dataMasking2.maskEmail2(HomePage.loginid, Userid);
         aDriver.type(HomePage.loginid, Userid, "emid id entered");
		// dataMasking2.maskPassword2(HomePage.pwd, Pwd);
		dataEncrypt_Decrypt2.encryptAndDecryptData(HomePage.pwd, Pwd);
		aDriver.click(HomePage.LoginButton, "button for login clicked");

	}

	public void maskedData(String userid, String pwd, String name, String rel, String occ, String pName,
			String age, String contact) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("maked data");

		aDriver.click(HomePage.gyno, "Gynology buton clicked");
		dataMasking2.maskName(HomePage.Name, name);

		dataMasking2.maskName(HomePage.phcName, pName);

		dataMasking2.maskOccupation(HomePage.Occupation, occ);
		dataMasking2.maskReligion(HomePage.Relegion, rel);
		dataMasking2.maskAge(HomePage.age, age);
		dataMasking2.maskMobileNumber(HomePage.contactnumber, contact);

	}

	public void unMasked_data(String distict, String education, String country, String pEdu, String pName,
			String family, String earningmem, String age, String contact) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("maked data");

		aDriver.type(HomePage.distict, distict, "excelfile");
		aDriver.type(HomePage.education, education, "enter data on eucation");
		aDriver.type(HomePage.country, country, "enter country name");
		aDriver.type(HomePage.P_Education, pEdu, "enter patner education");
		aDriver.type(HomePage.p_name, pName, "enter patner Name");
		aDriver.type(HomePage.fmem, family, "enter family member");
		aDriver.type(HomePage.e_mem, earningmem, " enter earning member");

		Thread.sleep(5000);

	}

	public void unmasked_data2(String city, String education, String country, String pEdu, String pName,
			String family, String earningmem,String dist,String state,String emem,String fmem) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("maked data");

		aDriver.type(HomePage.city, city, "enter city name");
		aDriver.type(HomePage.education, education, "enter data on eucation");
		aDriver.type(HomePage.country, country, "enter country name");
		aDriver.type(HomePage.P_Education, pEdu, "enter patner education");
		aDriver.type(HomePage.p_name, pName, "enter patner Name");
		
		
		aDriver.type(HomePage.distict, dist, "enter distict name");
		aDriver.type(HomePage.state, state, "enter state");
		aDriver.type(HomePage.fmem, fmem, "enter family member");
		aDriver.type(HomePage.e_mem, emem, "enter earning member");
		
		aDriver.click(HomePage.logout, "log out button clicked");
		aDriver.click(HomePage.songout, "sing out button clicked");
		Thread.sleep(5000);
	}

}
