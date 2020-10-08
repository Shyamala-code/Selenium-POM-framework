package automation_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Dressespage {
	
	WebDriver driver;
	
	@FindBy (css="div.content_scene_cat_bg") WebElement pageVerification;
	
	@FindBy (css="div#categories_block_left>div>ul>li:first-of-type") WebElement CasualDresses;
	
	@FindBy (css="div#categories_block_left>div>ul>li:nth-of-type(2)") WebElement EveningDresses;
	
	@FindBy (css= "div#categories_block_left>div>ul>li:last-of-type") WebElement SummerDresses;
	
	//Selected the last item in the displayed list. We can select any.
	@FindBy (css= "ul.product_list>li:last-of-type") WebElement ToselectaDress;
	
	//To do Lazy initialization
	public  Automation_Dressespage(WebDriver driver){
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	public void VerifyPageByText(String expText) {
	if(pageVerification.getText().toString().contains(expText))
    {
    System.out.println("Navigated to Dresses page:" +expText);
    }
	else {
	System.out.println("Not navigated to dresses page");
	}
	}
	
	public void ToSelectCasual() {
	CasualDresses.click();
	}
	
	public void ToSelectEvening() {
	EveningDresses.click();
	}
	
	public void ToSelectSummer() {
	VerifyPageByText("Dresses");
	SummerDresses.click();
	VerifyPageByText("Summer");
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)");
    ToselectaDress.click();
	}
	
    
}
