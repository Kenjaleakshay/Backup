package Kenjale.PracticeMaven;

import org.testng.annotations.Test;

@Test(groups = {"regres1"})
public class Groupspra {
	
	@Test (groups = {"sanity.ts1"})
	public void cx() {
		System.out.println("cx is executed");
	}
	
	@Test (groups = {"smoke"})
	public void xf() {
		System.out.println("xf is executed");
	}
	
	@Test(groups = {"sanity.ts2"})
	public void nd() {
		System.out.println("nd is executed");
	}
	
	@Test(groups = {"smoke"})
	public void ms() {
		System.out.println("ms is executed");
	}
	
	@Test(groups = {"sanity.ts1"})
	public void js() {
		System.out.println("js is executed");
	}
	
	@Test(groups = {"sanity.ts2"})
	public void ps() {
		System.out.println("cx is executed");
	}

}
