package com.ui.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void ValidLoginTest() {

		assertEquals(
				loginPage.enterUserName("admin").enterPassword("admin@123").clickOnSubmit().getLoginSuccessMessage(),

				"Login successful!");

	}

}
