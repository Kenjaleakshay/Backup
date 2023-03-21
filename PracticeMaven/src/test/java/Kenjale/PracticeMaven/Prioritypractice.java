package Kenjale.PracticeMaven;

import org.testng.annotations.Test;

public class Prioritypractice {
	
	@Test(priority = 2)
	public void aks() {
		System.out.println("aks has run");
	}
   @Test(priority = 2)
	public void aks2() {
		System.out.println("aks2 has run");
	}
	@Test
   public void def() {
	   System.out.println("def has run");
   }
   
	@Test(priority = 0)
   public void hij() {
	   System.out.println("hij has run");
	   }
	
	@Test
	public void xyz() {
		System.out.println("xyz has run");
	}
	
	@Test
	public void pqr() {
		System.out.println("pqr has run");
	}
	
	
}
