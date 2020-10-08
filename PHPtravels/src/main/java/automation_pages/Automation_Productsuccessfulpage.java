package automation_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Productsuccessfulpage {
	
	WebDriver driver;
	
	//String expText="Product successfully added";
	
	String SP=Automation_Productdetailpage.selectedProduct;
	
	//Automation_Productdetailpage apd=new Automation_Productdetailpage(driver);
	
	@FindBy (id ="layer_cart_product_title") WebElement productName;
	
	@FindBy (css="a.button-medium") WebElement checkOut;
	
	//@FindBy (css="div.layer_cart_product,.layer_cart_cart>span") WebElement successfull;
	
	public Automation_Productsuccessfulpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	/*public void VerifyCorrectNavigation() {
	if (successfull.getText().toString().contains(expText)){
	System.out.println("Product successfully added");
	}
	else {
	System.out.println("Product is not added");
	}
	}*/
	
	public void CheckingOut() throws InterruptedException {
	//apd.storingProductName();
	String SP=Automation_Productdetailpage.selectedProduct;
	//String successpagepProductName=productName.getText().toString();
	System.out.println("Inherited value:" +SP);
	//System.out.println("driver value at checking out " +driver);
	//System.out.println("Success page product Name is " +successpagepProductName);
	
	Actions action=new Actions(driver);
	//action.moveToElement(productName).build().perform();
	//action.moveToElement(checkOut).click().build().perform();
	
	if(action.moveToElement(productName).toString().contentEquals(SP))
	/*if(text.contains(SP))*/ {
	System.out.println("Verified page with product Name");
	action.moveToElement(checkOut).click().build().perform();
	}
	else
	System.out.println("The selected product and navigated page product is different");
	action.moveToElement(checkOut).click().build().perform();
	}
	
	}	
	


