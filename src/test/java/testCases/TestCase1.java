package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseSetup;
import pages.CellPhonePage;
import pages.HomePage;
import pages.MenuPage;

public class TestCase1 extends BaseSetup {

	//1. Create the Page Object and give them null value
	//2. We need to get Driver 
	//3. That we need to create our TestCase
	
	/* Create the Page Objects as per your Project */ 
	WebDriver driver;
	HomePage homeObj=null;
	MenuPage menuObj=null;
	CellPhonePage cellObj=null;
	
	
	/*
	 * Create the following method as it is , just change the name of obj & classes
	 * as per your project
	 */
	
	@BeforeSuite
	public void initialSetup()
	{
		driver=getDriver();//now driver contains the properties for chromeBrowser
		homeObj=new HomePage(driver);//Constructors are called internally 
		menuObj=new MenuPage(driver);//Constructors are called internally
		cellObj=new CellPhonePage(driver);//Constructors are called internally
	}
	
//	HomePage homeObj=new HomePage();
//	MenuPage menuObj=new MenuPage();
//	CellPhonePage cellObj=new CellPhonePage();
	
	
	/* Now Create your Test Case */
	@Test
	public void TC1()
	{
		homeObj.homePageVerification();
		homeObj.navigateToMenu();
		menuObj.menuNavigation();
		cellObj.verifyHeader();
	}
	
}
