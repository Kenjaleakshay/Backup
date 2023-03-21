package Selenium_explore;

public class Scenario2 extends Launching_Browser {
    String expTitle = "Sign up for Facebook | Facebook";
	public void verifyTitle() {
		String actTitle = g.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Test Scenario is passed and ActTitle is = "+ actTitle);
		}
		else {
			System.out.println("Test Scenario is Failed and ActTitle is = "+ actTitle);
		}
	}
		
		
		
		
	
}
