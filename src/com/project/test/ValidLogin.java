package com.project.test;

import org.testng.annotations.Test;

import com.project.page.FacebookPage;

import generic.BaseTest;

public class ValidLogin extends BaseTest {

	@Test(priority = 1, groups = { "login" })
	public void testValidLogin() {
		FacebookPage f = new FacebookPage(driver);
		f.setEmail("");
		f.setPass("");
		f.submitPass();
	}
}
