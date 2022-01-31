package com.Demo_actiTIME.testcases;

import org.testng.annotations.Test;

import com.Demo_actiTIME.pageobjectmodel.Login;

public class Testcase_TC_001 extends BaseClass{

	@Test
	
	public void login_Test() throws InterruptedException
	{
		Login login = new Login(driver);
		login.setuserName(userName);
		Thread.sleep(2000);
		login.setPassword(Password);
		Thread.sleep(2000);
		login.click_Login();
		Thread.sleep(2000);
	}
	
}
