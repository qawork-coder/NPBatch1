package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	
	WebDriver driver;
	
	public MenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[text()='Electronics'])[3]")
	public WebElement electronicsTile;
	
	@FindBy(xpath  ="(//*[text()='Cell Phones & Accessories'])[1]")
	public WebElement cellPhoneTile;
	
	
	public void menuNavigation()
	{
		electronicsTile.click();
		cellPhoneTile.click();
	}
	
}
