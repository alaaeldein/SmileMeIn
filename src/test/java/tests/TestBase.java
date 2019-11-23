package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import utilities.Helper;

public class TestBase {
	
	public static WebDriver driver;
	
	@AfterMethod
	public void screenshotOnFailure (ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println ("Failed!");
			System.out.println ("Taking screenshots .....");
			Helper.captureScreenshot (driver, result.getName());
		}

	}

	@BeforeSuite
	public void setUpEnvironment() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
/*	@AfterSuite
	public void stopEnvironment() {
		
		driver.quit();
	}*/

}
