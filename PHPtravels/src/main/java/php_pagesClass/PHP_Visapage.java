package php_pagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PHP_Visapage {
	
	WebDriver driver;
	
	@FindBy(css= "a.visa") WebElement Visa;
	
	public void applyingVisa() {
		Visa.click();
		
	}
	
}
