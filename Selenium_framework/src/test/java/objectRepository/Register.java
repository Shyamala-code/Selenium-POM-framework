package objectRepository;

import org.openqa.selenium.By;

public class Register {
	
	public static By registerpage=By.linkText("REGISTER");
	public static By username=By.id("email");
	public static By password=By.name("password");
	public static By conpassword=By.name("confirmPassword");
	public static By registration=By.name("submit");
	public static By successfulregistration=By.linkText("sign-in");

}
