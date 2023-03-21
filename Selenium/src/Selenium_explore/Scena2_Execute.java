package Selenium_explore;

public class Scena2_Execute extends Scenario2  {
	
	public static void main(String[] args) {
		
		Scena2_Execute m = new Scena2_Execute();
		m.launchChrome();
		m.verifyTitle();
		g.quit();
		
	}

}
