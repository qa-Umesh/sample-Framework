package com.ui.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class NewBrandTest extends BaseTest {

	private HomePage homePage;
	String imgFilePath = "/Users/umesh/Downloads/BrandImg.jpg";

	@BeforeMethod
	public void loginApplication() {
		homePage = loginPage.enterUserName("admin").enterPassword("admin@123").clickOnSubmit();

	}

	@Test
	public void AddNewBrandTest() {

		assertEquals(

				homePage.navigateToAddBrand().enterBrandName("test01").uploadImg(imgFilePath).clickOnCreate()
						.getBrandNameAddedMessage(),

				"Brand added successfully");

	}

}
