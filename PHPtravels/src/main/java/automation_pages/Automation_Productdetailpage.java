package automation_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Productdetailpage {
	
	WebDriver driver;
	
	static String selectedProduct;
	
	@FindBy (id="send_friend_button") WebElement SendToFriend;
	
	@FindBy (css= "div.pb-center-column>h1")WebElement productName;
	
	@FindBy (css="p#product_reference>label+span") WebElement SelectedDressName;
	
	@FindBy (id="add_to_cart") WebElement CartAdding;

	//To do Lazy initialization
	public Automation_Productdetailpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public String storingProductName () throws InterruptedException{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	if(SendToFriend.isDisplayed()) {
	selectedProduct=productName.getText();
	System.out.println("The selected product is " +selectedProduct);
	}
	else
	System.out.println("Can't able to get the product name");
	return selectedProduct;
	}
	
	public void AddingtoCart() {
	CartAdding.click();
	}
}
