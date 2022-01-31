package com.Demo_actiTIME.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver idriver;
	public Login(WebDriver rdriver)
	{
		idriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name = "username")
	WebElement txtuserName;

	@FindBy(name = "pwd")
	WebElement txtPassword;

	@FindBy(xpath = "//div[text()='Login ']")
	WebElement submit_Login;

	public void setuserName(String userName)
	{
		txtuserName.sendKeys(userName);
	}
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	public void click_Login()
	{
		submit_Login.click();
	}
}
