package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

// never throw the exception in framework instead use try/catch block

public class BasePage {

	public WebDriver driver; // do not declare WebDriver as static it will
	// run
	// only one browser

	public void verifyTitle(String title) {
		String actual = driver.getTitle();
		Assert.assertEquals(actual, title);
	}

	public void verifyTitle(long time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Title is not matching", true);
			Assert.fail();
		}
	}

	public void verifyElementIsPresent(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}

	public boolean verifyElementIsPresent(WebDriver driver, long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			// Reporter.log("Element is Present", true);
			return true;
		} catch (Exception e) {
			Reporter.log("Element is not Present", true);

			Assert.fail();
			return false;
		}
	}

	public void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (Exception e) {
		}
	}

}
