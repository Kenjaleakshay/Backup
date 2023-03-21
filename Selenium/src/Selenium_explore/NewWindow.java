package Selenium_explore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow extends Launching_Browser{
	
	WebDriver f;
	
	public void newwindow() {
		System.setProperty(key1, value1);
		f = new ChromeDriver();
		f.manage().window().maximize();
		f.get(url1);
		f.navigate().to(url1);
		//WebDriver newTab = f.switchTo().newWindow(WindowType.TAB); 
		//newTab.get(url2);
		//newTab.close();
		WebDriver newWindow = f.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get(url2);
		f.manage().window().fullscreen();
	    f.quit();
	    
	   }
	
	public void newwindprac() {
		
		WebDriver nt= f.switchTo().newWindow(WindowType.TAB);
		nt.navigate().to(url1);
		WebDriver nw = f.switchTo().newWindow(WindowType.WINDOW);
		
		
	}

}
