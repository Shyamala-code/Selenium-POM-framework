package automation_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_ShoppingcartSummarypage {
	
	WebDriver driver;
	
	@FindBy (css="li.step_current>span") WebElement Summary;
	
    @FindBy (css="a.standard-checkout") WebElement Standardcheckout;
	
	@FindBy(css="li.second>span") WebElement SignIn;
	
	public Automation_ShoppingcartSummarypage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void SummaryCheckOut() {
	if(Summary.isDisplayed()) {
	Standardcheckout.click();
	System.out.println("Smoke test is passed");
	}
	else
	System.out.println("Summary is not displayed");
	}


}
