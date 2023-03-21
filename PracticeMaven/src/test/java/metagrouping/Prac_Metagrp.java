package metagrouping;

import org.testng.annotations.Test;
import org.testng.Assert;



public class Prac_Metagrp {
	
	@Test(groups = {"regres"})
	public void jd() {
		System.out.println("jd is executed");
	}
	
	@Test(groups = {"testng"})
	public void ks() {
		System.out.println("ks is executed");
	}
	
	@Test(groups = {"regres"})
	public void le() {
		System.out.println("le is executed");
		String act = "mno";
		String exp = "jj";
		Assert.assertEquals(act, exp);
	}
	
    @Test(groups = {"regres"})
	public void he() {
		System.out.println("he is executed");
	}
	

}
