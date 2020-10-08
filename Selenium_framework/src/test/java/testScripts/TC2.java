package testScripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.CommonFunctions;

public class TC2 extends StartBrowser {
  @Test
  public void flightfinder() throws Exception
  
  {
	  CommonFunctions cf=new CommonFunctions();
	  cf.flights();
	  
  }
}
