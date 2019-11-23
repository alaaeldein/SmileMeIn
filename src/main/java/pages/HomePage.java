package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//*[@id=\"overview\"]/div/div[1]/nav/ul/li[6]/a")
	WebElement ContactUsPageButton;
	
	@FindBy (xpath = "//*[@id=\"contact\"]/div/div[2]/div[1]/a[2]")
	WebElement launchFormPricing;
	
	
	public void openContactUsPage () {
		
		clickButton(ContactUsPageButton);
	}
	
	public void openLaunchFormPricing() {
		
		clickButton(launchFormPricing);
	}
	
	

}
