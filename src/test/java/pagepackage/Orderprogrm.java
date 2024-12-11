package pagepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderprogrm {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"TextField2\"]")
	
	WebElement compnyname;
	
	@FindBy(xpath="//*[@id=\"shipping-address1\"]")
	WebElement adress;
	
	@FindBy(xpath="//*[@id=\"number\"]")
	WebElement cardno;
	@FindBy(xpath="//*[@id=\"expiry\"]")
	WebElement expdate;
	@FindBy(xpath="//*[@id=\"verification_value\"]")
	WebElement secucode;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/header/div/div/div/div/div/div/span/a")
	WebElement h;
	
	public Orderprogrm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void forms(String Name)
	{
		compnyname.sendKeys(Name);
	
	}
	public void adre(String Ad)
	{
		adress.sendKeys(Ad,Keys.ENTER);
	}
	public void pay(String cardnumb,String expiriodate,String securitycode)
	{
		cardno.sendKeys(cardnumb);
		expdate.sendKeys(expiriodate);
		secucode.sendKeys(securitycode);
		h.click();
	}
	

}
