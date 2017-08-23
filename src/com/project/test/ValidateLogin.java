package com.project.test;

import org.testng.annotations.Test;

import com.project.page.FacebookPage;

import generic.BaseTest;

public class ValidateLogin extends BaseTest {

	@Test(priority = 1, groups = { "login" })
	public void testFaceBookLogin() {
		FacebookPage f = new FacebookPage(driver);
		f.setEmail("ks.madhan7@gmail.com");
		f.setPass("");
		f.submitPass();
	}
}
