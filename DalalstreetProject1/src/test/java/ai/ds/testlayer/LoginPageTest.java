package ai.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.pagelayer.LoginPage;
import ai.ds.testbase.TestBase;

public class LoginPageTest extends TestBase{

	
	@Test
	public void verifyLogin() throws InterruptedException {
		
		String exp = "https://apps.dalalstreet.ai/dashboard";
		
		
		
		String act = lgin.getCurrentUrl();
		Assert.assertEquals(act,exp);
		
	}
}
