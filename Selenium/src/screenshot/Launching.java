package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Launching implements Common_prop{
	
	WebDriver g;
	
	public void launchonly() {
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		
		
		
	}
	public void launching() throws IOException {
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		g.navigate().to(url1);
		
		//taking Screenshot
		//TakesScreenshot is another interface which is child to the WebDriver Interface.
		//TakesScreenshot has the getScreenshotAs method ,but we cannot access that method 
		//because g variable is of Webdriver type (which is parent to the TakesScreenshot interface)
		// So, in order to access the methods present in the TakesScreenshot interface(child )
		// First, we have to do DownCasting.
		
		TakesScreenshot ts = (TakesScreenshot)g;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//Now,we have to create the object of File class by passing an argument of path of desired 
		//folder in the constructor.
		String path = "E:\\Screenshots\\Facebook.png";
		File des = new File(path);
		//Now , we have to copy image in src to destination folder by FileHandler class . copy 
		//method and passing arguments in sequence like (source,destination).
		FileHandler.copy(src, des);
		
		
		 WebElement ele = g.findElement(By.xpath("//input[@name='pass']"));
		 File scr = ele.getScreenshotAs(OutputType.FILE);
		 String pat = "E:\\Screenshots\\pass.png";
		 File ds2 = new File(pat);
		 FileHandler.copy(scr,ds2);
		 
		 }
	
	public void launch2() {
		
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		g.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement elle = g.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		g.switchTo().frame(elle);
		g.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		g.switchTo().defaultContent();
		
	}

}
