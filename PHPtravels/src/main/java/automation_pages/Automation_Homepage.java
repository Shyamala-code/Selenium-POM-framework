package automation_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Automation_Homepage {
	
    WebDriver driver; 
	
	@FindBy (css="ul.menu-content>li>a[title='Women']") WebElement Women;

	@FindBy (css= "ul.menu-content>li>a[title='Dresses']") WebElement Dresses;
	
	@FindBy (css="ul.menu-content>li>a[title='T-shirts']")WebElement TShirts;
	
	@FindBy (css= "a.login") WebElement SignIn;
	
	public  Automation_Homepage(WebDriver driver){
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	
	public void ToSelectWomen() {
	Women.click();
	}
	
	public void ToSelectDresses() {
	Dresses.click();
	}
	
	public void ToSelectTShirts() {
	TShirts.click();
	}
	
	public void clickSignIn() {
    SignIn.click();
	}
	
	
	
}
