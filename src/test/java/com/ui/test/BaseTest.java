package com.ui.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ui.constants.Browser;
import com.ui.pages.LoginPage;

public class BaseTest {

	public LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		loginPage = new LoginPage(Browser.CHROME);
	}

	@AfterMethod
	public void quite() {
		loginPage.quite();
	}

}
