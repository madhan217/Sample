package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest implements IAutoConst {

	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public WebDriver driver;

	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@AfterTest
	public void closeApplication() {
		driver.close();
	}

}