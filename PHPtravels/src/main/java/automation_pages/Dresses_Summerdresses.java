package automation_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dresses_Summerdresses {
	
	WebDriver driver;
	
	//@FindBy (css="div.layer_cart_product,.layer_cart_cart") WebElement cartSuccessfulPage;
	
	//To do Lazy initialization
	public Dresses_Summerdresses(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	/*public void selectingSummerDress() throws InterruptedException{
	Dresses.click();
	SummerDresses.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)");
    ToselectaDress.click();
    SelectedDressName.getText();
    CartAdding.click();
    }
	
	public void verifyTextpresent(String expText) {
		if (driver.getPageSource().contains(expText)){
			System.out.println("Product successfully added");
		}
		else {
			System.out.println("Product is not added");
		}
	}		
	
	
    public void checkout() {
    	checkOut.click();
    }
		
	public void Summarycheckout() {
    if(Summarycheckout.isEnabled()) {
    	Standardcheckout.click();
    }
    else {
    	System.out.println("Not redirected to the correct page");
    }
	}
	
	public void SmokeTestStatus() {
		if(SignIn.isEnabled()) {
			System.out.println("smoke Test passed");
		}
		else {
			System.out.println("Smoke test failed");
		}
	}*/
}
