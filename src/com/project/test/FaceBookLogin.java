package com.project.test;

import org.testng.annotations.Test;
import com.project.page.FacebookPage;
import generic.BaseTest;

public class FaceBookLogin extends BaseTest {
	@Test(priority = 1, groups = { "login" })
	public void testFaceBookLogin() {
		FacebookPage f = new FacebookPage(driver);
		f.setEmail("ks.madhan7@gmail.com");
		f.setPass("skyblue28");
		f.submitPass();
	}
}
