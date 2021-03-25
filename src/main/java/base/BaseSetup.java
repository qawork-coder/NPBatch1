package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseSetup {

	/* ***********************Write the below method wherever you want , just change the URL
	 * And just change the Path of ChromeDriver*************/
	
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		return driver;
	}
}
