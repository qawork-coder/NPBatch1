package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {

	WebDriver driver;

	public CellPhonePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[text()='Cell Phones & Accessories'])[3]")
	public WebElement cellPhoneHeader;

	public void verifyHeader() {
		System.out.println(cellPhoneHeader.isDisplayed());
	}
}
