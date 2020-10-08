package Automation_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation_pages.Automation_Dressespage;
import automation_pages.Automation_Homepage;
import automation_pages.Automation_Productdetailpage;
import automation_pages.Automation_Productsuccessfulpage;
import automation_pages.Automation_ShoppingcartSummarypage;

public class SmokeTest_SummerDress  {

	
    WebDriver driver;
  //WebDriverWait wait;
  
 
@BeforeSuite
  public void setdriver() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  
	  //Object is created and chrome driver is opened
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("http://automationpractice.com/index.php");
      Thread.sleep(3000);
      System.out.println("driver before test= " +driver);
      
}
  @Test(priority=0)
  public void SummerDress() throws InterruptedException{
  //System.out.println("driver entering test= " +driver);
  Automation_Homepage homepage=new Automation_Homepage(driver);
  Automation_Dressespage dresspage=new Automation_Dressespage(driver);
  Automation_Productdetailpage  productpage= new Automation_Productdetailpage(driver);
  Automation_Productsuccessfulpage successpage=new Automation_Productsuccessfulpage(driver);
  Automation_ShoppingcartSummarypage Summary=new Automation_ShoppingcartSummarypage(driver);
  
  homepage.ToSelectDresses();
  dresspage.ToSelectSummer();
  productpage.storingProductName();
  productpage.AddingtoCart();
  Thread.sleep(2000);
  successpage.CheckingOut();
  Summary.SummaryCheckOut();
  
  }
  //Automation_Dressespage dresspage=new Automation_Dressespage(driver);
  
  
  //homepage.ToSelectDresses();
  //dresspage.ToSelectSummer();
  
  }
  

  /*@AfterTest
  public void closedriver() {
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.close();
  }*/


