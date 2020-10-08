package wdcmds;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import config.StartBrowser;

public class ActionDriver {
	
	WebDriver driver;
	public ActionDriver() {
		driver=StartBrowser.driver;
		
	}
// This is used to navigate to the application 
public void navigateToApplication(String url) throws Exception {
	try {
		driver.get(url);		
	}
	catch (Exception e){
		throw e;
	}
}

// It is used to perform click action on buttons,links,check boxes
//@param locator ----get from object repository
//@param eleName ----- Name of the element
//@throws exception
public void click (By locator, String eleName) throws Exception {
	try {
		driver.findElement(locator).click();
		}
	catch (Exception e) {
		throw e;
	}
}

//It is used to perform type action in textbox and text area
public void type (By locator,String testData, String eleName ) throws Exception {
	try {
		driver.findElement(locator).sendKeys(testData);
	}
    catch (Exception e) {
    	throw e;
    }
	}

//To verify any text in the web page
public void isTextPresent(String text) throws Exception {
	try {
		if(driver.getPageSource().contains(text)) {
			System.out.println("The text is present "+text  );
		}
	    
	    else {
	    	System.out.println("The text is not present");
	    }
		}
	catch (Exception e) {
		throw e;
	}
}

//To select a value from drop down
public void dropdown(By locator, String eleName, String visibleText) throws Exception {
	try {
		Select values = new Select (driver.findElement(locator));
		values.selectByVisibleText(visibleText);
	}
	catch (Exception e) {
		throw e;
	}
}
//To verify link text present in the web page
public void islinkPresent(String linktext) throws Exception {
try {
	WebElement linkname=driver.findElement(By.linkText(linktext));
	if(linkname.isDisplayed()) {
		System.out.println("Link is present" +linkname);
	}
	else {
		System.out.println("Link not present");
	}

}
catch(Exception e) {
	throw e;
}

}



}
