package ai.ds.testlayerr;

import org.testng.Assert;
import org.testng.annotations.Test;


import ai.ds.testbase.Testbase;

public class LoginPageTest extends Testbase {
	
   @Test
	public void verifyLogin() throws InterruptedException {
		
		
		lgin.enterEmailid();
		lgin.enterPassword();
		lgin.clickOnLogin();
		Thread.sleep(3000);
		String act = driver.getCurrentUrl();
		String exp = "https://apps.dalalstreet.ai/dashboard";
		Assert.assertEquals(act, exp);
		
	
   }


}
