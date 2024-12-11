package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allbirdslogin {
	WebDriver driver;
	
	@FindBy(id="CustomerEmail")
	WebElement mail;
	@FindBy(id="CustomerPassword")
	WebElement pswwd;
	@FindBy(xpath="//*[@id=\"customer_login\"]/input[5]")
	WebElement log;
	@FindBy(xpath="//*[@id=\"top-navigation\"]/nav/div[1]/a")
	WebElement home;
	public Allbirdslogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void allbirdsvalues(String Email,String Password)
	{
		mail.sendKeys(Email);
		pswwd.sendKeys(Password);
	}
	public void login()
	{
		log.click();
	}
	public void clickhome()
	{
		home.click();
	}
	

}
