package tests;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.PricingFormPage;

public class LaunchPricingForm extends TestBase{
	
	HomePage homePageObj;
	PricingFormPage pricingFormPageObj;
	
	@DataProvider(name = "fill pricing form")
	public Object[][] loginIntoAltairData() throws IOException {

		ExcelReader excelReaderObj = new ExcelReader();
		return excelReaderObj.getExcelData(0, 1, 4);
	}
	
	@Test(priority = 0, dataProvider = "fill pricing form")
	public void fillPricingForm (String firstName, String lastName, String email, String phoneNumber) throws InterruptedException {
		
		//open smile me in website
		driver.get("https://www.smileme.in/");
		
		//open contacts us section
		homePageObj = new HomePage(driver);
		homePageObj.openContactUsPage();
		
		Thread.sleep(5000);
		
		//open pricing form
		homePageObj.openLaunchFormPricing();
		
		Thread.sleep(5000);

		driver.switchTo().frame(0);

		//fill pricing form
		pricingFormPageObj = new PricingFormPage(driver);
		pricingFormPageObj.startPricingForm();
		
		pricingFormPageObj.setFirstName(firstName);
		pricingFormPageObj.setLastName(lastName);
		pricingFormPageObj.setEmail(email);
		pricingFormPageObj.setPhoneNumber(phoneNumber);
		pricingFormPageObj.selectCountryBased();
		pricingFormPageObj.selectServiceType();
		pricingFormPageObj.clickSubmit();
		
		String currentWindowTitle = driver.getTitle();
		Assert.assertEquals(currentWindowTitle, "SmileMe.In | Home");
	}

}
