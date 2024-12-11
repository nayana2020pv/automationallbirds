package pagepackage;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Addtocartpg {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"pdp-size-selector\"]/ul/li[7]/button/span")
	WebElement btn;
	@FindBy(xpath="//button[@id=\"add-to-cart\"]")
	WebElement cartbtn;
	@FindBy(xpath="//div[@class=\\\"AddToCartModal__portal\\\"]/div/div/div[1]/div[2]/div[2]/div/div[2]/button")
	WebElement checkout;
	//@FindBy(xpath="//*[@id=\"women-39-s-canvas-pipers-blizzard-blizzard-sole\"]/div[24]/div/div/div[1]/div[2]/div[2]/div/div[2]/button")
	//WebElement increment;
	//@FindBy(xpath="//*[@id=\"drawer-body\"]/div/div/div[1]/div[1]/div[2]/div/div/button[1]")
	//WebElement decrement;
	@FindBy(xpath="//*[@id=\"cart\"]/div/div/div/div[3]/div/div/div[3]/a")
	WebElement proceed;
	
	public Addtocartpg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void add()
	{
		btn.click();
		cartbtn.click();
	}
	public void checkoutpgm()
	{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		checkout.click();
		proceed.click();
		//increment.click();
		//decrement.click();
	}
	
	

}
