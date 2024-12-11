package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Titleverification {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"top-navigation\"]/nav/div[1]/a/div")
	WebElement logo;
	
	public Titleverification(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void logoverification()
	{
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	public void title()
	{
		
		
			String exp="";
			String act=driver.getTitle();
			System.out.println(act);
			Assert.assertEquals(exp, act);
	}

}
