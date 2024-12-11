package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class Basepage1 {
	WebDriver driver;
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.allbirds.com/account/");
		
	}
	
	
}
