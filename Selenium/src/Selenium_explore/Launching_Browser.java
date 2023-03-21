package Selenium_explore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Browser implements Common_Properties {
	
   static WebDriver g;
	
	public void launchChrome(){
		System.out.println("Launching chrome");
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		g.get(url1);
		//Thread.sleep(3000);//this is not valid here because of  throws exception
		//g.get(url2);
	  //  g.navigate().back();
	  //  g.navigate().forward();
		//System.out.println("Chrome launced successfully");	
		//g.quit();
	}
	
	public void launchFirefox() {
		System.out.println("Launching Firefox");
		System.setProperty(key2,value2);
		g = new FirefoxDriver();
		g.get(url2);
		System.out.println("Firefox launched successfully");	
	}

}
