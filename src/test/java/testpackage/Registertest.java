package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagepackage.Registration;

public class Registertest {
	
	WebDriver driver;
	
	/*@BeforeMethod
	
	public void setupurl()
	{
		driver=new ChromeDriver();
		driver.get("https://www.allbirds.com/account/login?return_url=%2Faccount");
		
	}*/
	@Test
	
	public void t1()
	{
		Registration r1=new Registration(driver);
		r1.values("Ammu","P V","nayanapv2020@gmail.com","Nayana@123","Nayana@123");
		r1.reg();
	}
	

}
