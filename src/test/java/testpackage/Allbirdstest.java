package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepackage.Basepage1;
import pagepackage.Addtocartpg;
import pagepackage.Allbirdslogin;
import pagepackage.Orderprogrm;
import pagepackage.Productbuying;
import pagepackage.Search;
import pagepackage.Titleverification;
import utility.Exeutil;



public class Allbirdstest   {
	WebDriver driver;
	
  @BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.allbirds.com/account/");
		driver.manage().window().maximize();
	}


	

	@Test(priority=1)
	
	public void testpgm() throws Exception
	{
		Allbirdslogin l1=new Allbirdslogin(driver);
		
		String x="C:\\Users\\nayan\\OneDrive\\Documents\\etsaybook.xlsx";
		String sheet="Sheet1";
		int rowCount=Exeutil.getRowCount(x, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String Email=Exeutil.getCellValue(x, sheet, i, 0);
			System.out.println("email"+Email);
			String Pwd=Exeutil.getCellValue(x, sheet, i, 1);
			System.out.println("password"+Pwd);
			l1.allbirdsvalues(Email, Pwd);
			l1.login();
			driver.navigate().refresh();
			//Thread.sleep(2000);
			
		}
		
		String expurl="https://www.allbirds.com/";
		String acturl=driver.getCurrentUrl();
		if(acturl.equals(expurl))
		{
			System.out.println("login test passed");
		}
		else
		{
			System.out.println("login test Failed");
		}
		
		l1.clickhome();
		
		Titleverification t1=new Titleverification(driver);
		t1.logoverification();
		t1.title();
		
		
		
	
		
	}
	
	@Test(priority=2)
	public void product() throws Exception
	{
		Productbuying p1=new Productbuying(driver);
		p1.screenshots("home1.png");
		p1.mouse();
		p1.filiter();
		p1.mouseimage();

		
		
	}
	
	@Test(priority=3)
	public void cartlog() 
	{

		Addtocartpg c1=new Addtocartpg(driver);
		c1.add();
		c1.checkoutpgm();
	}
	
	@Test(priority=4)
	public void orderpgm()
	{
		Orderprogrm o1=new Orderprogrm(driver);
		o1.forms("abc");
		o1.adre("ss");
		WebElement drop=driver.findElement(By.id("Select1"));
		Select s1=new Select(drop);
		s1.selectByVisibleText("Alaska");
		o1.pay("677893", "7-8-2027", "fyry75");
		
	
	}
  @Test(priority=5)
	
	public void test()
	{
		Search s1=new Search(driver);
		s1.seclick();
		s1.serachvalue("Mens shoes");
	}

	
	
	
		
		

}
   
		

  

	
	
		
	
	

