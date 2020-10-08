package config;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class StartBrowser {
	/* I am declaring as static so that I can use the object of webdriver through out
	 this project*/
  public static WebDriver driver;
  
  /*@Test
  public void launch() {
	  driver.get("http://demo.guru99.com/test/newtours/");
  }*/
 
  @BeforeClass
  public void beforeClass() {
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  }
 @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
