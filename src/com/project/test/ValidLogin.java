package com.project.test;

import org.testng.annotations.Test;

import com.project.page.FacebookPage;

import generic.BaseTest;

public class ValidLogin extends BaseTest {

	@Test(priority = 0, groups = { "login" })
	public void testValidLogin() {
		FacebookPage f = new FacebookPage(driver);
		f.setEmail("ks.madhan7@gmail.com");
		f.setPass("skyblue28");
		f.submitPass();
		f.verifyNameisPresent();
	}
}
