package Selenium_explore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebbok_login extends Launching_Browser {

	public void launchChrome(){
		System.out.println("Launching chrome");
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		g.get(url1);
		//WebElement jj = g.findElement(By.name("email"));
	//	jj.sendKeys("7276332709");
		WebElement kk = g.findElement(By.name("pass"));
		
		kk.sendKeys("jackreacher");
		g.findElement(By.name("login")).click();
		//Thread.sleep(3000);//this is not valid here because of  throws exception
		//g.get(url2);
	  ///  g.navigate().back();
	 //   g.navigate().forward();
		//.out.println("Chrome launced successfully");	
	//	g.quit();
}
}