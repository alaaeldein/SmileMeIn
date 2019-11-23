package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PricingFormPage extends PageBase{

	public PricingFormPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[2]/div/div/div/div/div/div/div[1]/button")
	WebElement startButton;
	
	@FindBy (id = "shortText-85d6fe70-c7c7-404e-ba74-c11794ec4a5e")
	WebElement firstNameTextBox;

	@FindBy (css = "button.button__ButtonWrapper-sc-1g3rldj-0.glpQoS")
	WebElement okButton;
	
	@FindBy (id = "shortText-df55c9b0-97cf-46a9-8258-7b6b0f979ed6")
	WebElement lastNameTextBox;
	
	@FindBy (id = "email-17513458-1420-499e-b184-3de5053b4556")
	WebElement emailTextBox;
	
	@FindBy (id = "phone-number-45e53899-bd2d-44e1-9c51-ab3751d99712")
	WebElement phoneNumberTextBox;
	
	@FindBy (css = "div.choice__ChoiceTitle-sc-103qo7w-0.gasHnv")
	WebElement countryBased;	
	
	@FindBy (xpath = "//*[@id=\"choice-359b6394-d553-4c5f-8606-d41f9e23048e\"]/div/div[2]")
	WebElement serviceType;
	
	@FindBy (xpath = "//*[@id=\"unfixedFooter\"]/div/div/div/div/div/div/div[1]/button")
	WebElement submitButton;
	
	public void startPricingForm() {
		
		clickButton(startButton);
	}
	
	public void setFirstName(String firstName) {
		
		setTextValue(firstNameTextBox, firstName);
		clickButton(okButton);
	}
	
	public void setLastName (String lastName) {
		
		setTextValue(lastNameTextBox, lastName);
		clickButton(okButton);
	}
	
	public void setEmail (String email) {
		
		setTextValue(emailTextBox, email);
		clickButton(okButton);
	}
	
	public void setPhoneNumber (String phoneNumber){
		
		setTextValue(phoneNumberTextBox, phoneNumber);
		clickButton(okButton);
	}
	
	public void selectCountryBased () throws InterruptedException {
	
		Thread.sleep(6000);
		clickButton(countryBased);
	}
	
	public void selectServiceType () throws InterruptedException {
		
		Thread.sleep(6000);
		clickButton(serviceType);
	}
	
	public void clickSubmit() throws InterruptedException {
		
		Thread.sleep(3000);
		clickButton(submitButton);
	}
}
