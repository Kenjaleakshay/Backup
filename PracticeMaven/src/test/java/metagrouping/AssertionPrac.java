package metagrouping;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPrac {
	
	SoftAssert k = new SoftAssert();
	
	@Test 
	public void ks() {
		String f = "lll";
		String k = "jjj";
		int i = 90;
		int n = 8;
		Assert.assertEquals(n,i,"ghg");
	}

	@Test
	public void jd() {
		String j = "oo";
		String l = "mm";
		Assert.assertNotEquals(j,l);
	}
	
	@Test
	public void kd() {
		String s = "kk";
		String m = "hh";
		String l = "kk";
		String o = "ll" + (12+6);
		System.out.println(o);
		Assert.assertTrue(m.equals(l),s.equals(l) + "what is this");
	}
	
	@Test
	public void sk() {
		int a = 80;
		int b = 90;
		k.assertTrue(8<5,"what is this");
		System.out.println("shshshhs");
		String j = "oowo";
		String i = "keow";
		k.assertTrue(j.equals(i));
		k.assertEquals(j,i);
		System.out.println("ksk");
		k.assertAll();
		System.out.println("ksk");
	}
	
	@Test
	public void oe() {
		k.assertNotNull(null);
		k.assertAll();
		
		
		
	}
}
