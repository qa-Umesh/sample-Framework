package com.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ui.constants.Browser;

public abstract class BrowserUtillity {

	private WebDriver driver;
	private WebDriverWait wait;

	public BrowserUtillity(Browser browser) {

		if (browser == Browser.CHROME) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		} else if (browser == Browser.FIREFOX) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--start-maximized");
			driver = new FirefoxDriver(options);
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		}

	}

	public void goToWebSite(String url) {
		driver.get(url);
	}

	public void enterText(By locator, String enterText) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(enterText);
	}

	public void clickOn(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.click();
	}

	public void quite() {
		driver.quit();

	}

	public String getVisibleText(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element.getText();
	}

}
