package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtillity;

public class HomePage extends BrowserUtillity {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private static final By MAIN_MASTER_DD_LOCATOR = By.xpath("//a//span[contains(text(),'Main Master')]");
	private static final By BRAND_OPTION_LOCATOR = By.xpath("//a//span[contains(text(),'Brand')]");
	private static final By NEW_BRAND_OPTION_LOCATOR = By.id("New-banner-tab3");
	private static final By LOGIN_SUCCESS_MESSAGE_LOCATOR = By.xpath("//p[@class='iziToast-message slideIn']");
	private static final By BRAND_NAME_TEXTBOX_LOCATOR = By.xpath("//input[@id='title']");
	private static final By BRAND_IMAGE_FILE_UPLOAD_LOCATOR = By.xpath("//input[@type='file']");
	private static final By CREATE_BTN_LOCATOR = By.xpath("//button[@id='createButton']");
	private static final By BRAND_NAME_ADDED_SUCCESS_MESSAGE_LOCATOR = By.xpath("//p[@class='iziToast-message slideIn']");


	public HomePage navigateToAddBrand() {
		clickOn(MAIN_MASTER_DD_LOCATOR);
		clickOn(BRAND_OPTION_LOCATOR);
		clickOn(NEW_BRAND_OPTION_LOCATOR);
		return this;

	}

	public HomePage enterBrandName(String brandName) {
		enterText(BRAND_NAME_TEXTBOX_LOCATOR, brandName);
		return this;
	}

	public HomePage uploadImg(String filePath) {
		enterText(BRAND_IMAGE_FILE_UPLOAD_LOCATOR, filePath);
		return this;

	}

	public HomePage clickOnCreate() {
		clickOn(CREATE_BTN_LOCATOR);
		return this;
	}

	public String getLoginSuccessMessage() {
		return getVisibleText(LOGIN_SUCCESS_MESSAGE_LOCATOR);
	}

	public String getBrandNameAddedMessage() {
		return getVisibleText(BRAND_NAME_ADDED_SUCCESS_MESSAGE_LOCATOR);
	}

}
