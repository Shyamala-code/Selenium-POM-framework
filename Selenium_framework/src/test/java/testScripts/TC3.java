package testScripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.CommonFunctions;

public class TC3 extends StartBrowser{
  @Test
  public void registration() throws Exception {
	  
	  CommonFunctions cf=new CommonFunctions();
	  cf.resgiterpage();
	  
  }
}
