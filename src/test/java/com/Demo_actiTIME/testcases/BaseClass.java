package com.Demo_actiTIME.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseURL="https://demo.actitime.com/login.do";
	public String userName="admin";
	public String Password="manager";
	public static WebDriver driver;

	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void tearDown()
	{
		driver.close();
	}
}
