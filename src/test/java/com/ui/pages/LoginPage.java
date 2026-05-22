package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.constants.Browser;
import com.utility.BrowserUtillity;

public class LoginPage extends BrowserUtillity {

	public LoginPage(Browser browser) {
		super(browser);
		goToWebSite("https://gocodex.com/psd_dev/");

	}

	private static final By USER_NAME_TEXTBOX_LOCATOR = By.xpath("//div[@class='mb-6']//input[@id='username']");
	private static final By PASSWORD_TEXTBOX_LOCATOR = By.xpath("//div[@class='mb-6']//input[@id='password']");
	private static final By LOGIN_BUTTON_LOCATOR = By.xpath("//div//button[contains(text(),'Login')]");
	private static final By LOGIN_SUCCESS_MESSAGE_LOCATOR = By.xpath("//p[@class='iziToast-message slideIn']");

	public LoginPage enterUserName(String text) {
		enterText(USER_NAME_TEXTBOX_LOCATOR, text);
		return this;
	}

	public LoginPage enterPassword(String text) {
		enterText(PASSWORD_TEXTBOX_LOCATOR, text);
		return this;
	}

	public LoginPage clickOnSubmit() {
		clickOn(LOGIN_BUTTON_LOCATOR);
		return this;
	}

	public String getLoginSuccessMessage() {
		return getVisibleText(LOGIN_SUCCESS_MESSAGE_LOCATOR);
	}

}
