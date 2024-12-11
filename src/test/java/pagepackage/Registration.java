package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	WebDriver driver;
	
	@FindBy(id="FirstName")
	WebElement Fname;
	
	@FindBy(id="LastName")
	WebElement Lname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="CreatePassword")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"CustomerPasswordConfirmation\"]")
	WebElement cnfpassword;
	
	@FindBy(xpath="//*[@id=\"create_customer\"]/input[8]")
	WebElement register;
	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void values(String Name,String Lastname,String Mail,String Pswd,String conpswd)
	{
		Fname.sendKeys(Name);
		Lname.sendKeys(Lastname);
		email.sendKeys(Mail);
		password.sendKeys(Pswd);
		cnfpassword.sendKeys(conpswd);
		
	}
	public void reg()
	{
		register.click();
	}
	
	
	
	
	

}
