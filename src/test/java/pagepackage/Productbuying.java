package pagepackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Productbuying {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"page-home\"]/div/div[1]/div[1]/nav/a[2]")
	WebElement e;
	
	@FindBy(xpath="//*[@id=\"parent-collection-container\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/button[7]")
	WebElement size;
	
	@FindBy(xpath="//*[@id=\"parent-collection-container\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/ul/li[1]/label/span[1]")
	WebElement everdaycheck;
	
	@FindBy(xpath="//*[@id=\"parent-collection-container\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/ul/li[7]/label/span[1]")
	WebElement materialcheck;
	
	@FindBy(xpath="//*[@id=\"parent-collection-container\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[4]/div/div/div/ul/li[1]/label/button/div")
	WebElement button;
	@FindBy(xpath="//*[@id=\"parent-collection-container\"]/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[1]/a/div[1]/div/img")
	WebElement image;
	
	public Productbuying(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void screenshots(String fileName)
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileHandler.copy(srcFile, new File("Screenshots/"+fileName));
			System.out.println("Screenshot saved as:"+fileName);
		}
		catch(IOException e)
		{
			System.out.println("failed to save screenshot"+e.getMessage());
		}
	}
	public void mouse()
	{
		
			
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		e.click();
        			
	}
	
	public void filiter()
	{
		size.click();
		everdaycheck.click();
		materialcheck.click();
		button.click();
	}
	
	
	public void mouseimage()
	{
      
		Actions act=new Actions(driver);
		act.moveToElement(image).perform();
		image.click();
		
	}

}
