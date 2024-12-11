package pagepackage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"top-navigation\"]/nav/div[1]/div[2]/a")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"SearchBarMinimal__input\"]")
	WebElement enter;
	
	public Search(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void seclick()
	{
		search.click();
    
	}
	public void serachvalue(String st)
	{
		
		enter.sendKeys(st);
	}

}
