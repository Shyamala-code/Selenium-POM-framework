package reuse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import config.StartBrowser;
import objectRepository.FlightFinderpage;
import objectRepository.LoginPage;
import objectRepository.Register;
import wdcmds.ActionDriver;

public class CommonFunctions {
	WebDriver driver;
	ActionDriver aDriver;

	public CommonFunctions() {
		driver=StartBrowser.driver;
		aDriver=new ActionDriver();
		
		
	}
	
  public void login() throws Exception {
	   aDriver.navigateToApplication("http://demo.guru99.com/test/newtours/index.php");
	   aDriver.type(LoginPage.txtUserName, "test", "Username textbox");
	   aDriver.type(LoginPage.txtPassword, "test", "Password textbox");
	   aDriver.click(LoginPage.btnsubmit, "Submit");
   }
   
   public void logout() throws Exception {
	   aDriver.click(LoginPage.lnksignoff,"SignOff");
   }
   
   public void flights() throws Exception{
	   {
	   aDriver.navigateToApplication("http://demo.guru99.com/test/newtours/index.php");
	   aDriver.click(FlightFinderpage.flightsfinder, "flights finder page");
	   aDriver.click(FlightFinderpage.oneway , "One Way");
	   aDriver.dropdown(FlightFinderpage.airlines, "Airline dropdown", "Pangea Airlines");
	   aDriver.click(FlightFinderpage.searchflights, "continue");
	   aDriver.isTextPresent("After flight finder");
	   
   }}
   
   // To register with the username and navigate to the sign-on page by the link
   public void resgiterpage() throws Exception {
	   aDriver.navigateToApplication("http://demo.guru99.com/test/newtours/index.php");
	   aDriver.click(Register.registerpage, "Register page");
	   aDriver.type(Register.username, "test@gmail.com", "Registering username");
	   aDriver.type(Register.password, "test", "Registering password");
	   aDriver.type(Register.conpassword, "test", "confirming password");
	   aDriver.click(Register.registration, "Submit");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   aDriver.islinkPresent("sign-in");
	   aDriver.click(Register.successfulregistration, "sign-in");
   }
   
}

