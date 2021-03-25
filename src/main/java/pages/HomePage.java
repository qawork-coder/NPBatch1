package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//WebElement sigIn=driver.findElement(By.id("")).click();
	
	//We are going to use a concept called as PageFactory
	
	//we include 3 things in a Page class 
	
	//1. Locators
	//2. Methods
	//3. Constructor
	
	//*************We need to write line 22 to 28 in every Page class and change the name of Constructor***********
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) //This constructors is initializing the Locators and the methods
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//This is initializing the current page Elements
	}
	
	/****** Create your respective Page locators ********/
	//locators
	
	@FindBy(id="nav-link-accountList")
	public WebElement signIn;
	
	@FindBy(id="nav-hamburger-menu") 
	public WebElement allIcon;
	
	
	/************************* Create you respective Page methods ***************/
	//methods
	public void homePageVerification()
	{
		System.out.println(signIn.isDisplayed());//it verifies whether element is present or not 
	}
	
	public void navigateToMenu()
	{
		allIcon.click();
	}
	
}
