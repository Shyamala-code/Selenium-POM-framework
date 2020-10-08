package testScripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.CommonFunctions;

public class TC1 extends StartBrowser{
  @Test
  public void login_logout() throws Exception {
	  CommonFunctions cfs=new CommonFunctions();
	  cfs.login();
	  cfs.logout();
	  }
  
}
