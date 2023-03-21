package Kenjale.PracticeMaven;

import org.testng.annotations.Test;

@Test(groups = {"regres1"})
public class Pra_Dependsonenabled {
	
	@Test (priority = 0,enabled = true)
	public void a1() {
		System.out.println("a1 is executed");
		
	}
	
	@Test (dependsOnMethods= {"a1"})
	public void a2() {
		System.out.println("a2 is executed");
	}

	@Test(dependsOnMethods= {"a1"})
	public void ss() {
		System.out.println("ss is executed");
	}
	
	@Test(enabled = false)
	public void hfh() {
		System.out.println("hfh is executed");
	}
	
	@Test
	public void sksk() {
		System.out.println("sksk is executed");
	}
}
