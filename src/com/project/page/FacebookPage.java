package com.project.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class FacebookPage extends BasePage {
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement pass;

	public WebDriver driver;

	public FacebookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void setEmail(String e) {
		// verifyElementIsPresent(driver, 10, email);
		email.sendKeys(e);
	}

	public void setPass(String f) {
		pass.sendKeys(f);
	}

	public void submitPass() {
		pass.submit();
		Assert.assertTrue(true);
	}

}
