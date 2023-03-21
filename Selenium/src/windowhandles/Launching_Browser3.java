package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Browser3 implements Common_Prop3 {
	
	WebDriver g;
	
	public void launchurl() throws InterruptedException {
		
		System.setProperty(key1, value1);
		WebDriver g= new ChromeDriver();
		g.manage().window().maximize();
		g.manage().deleteAllCookies();
		g.navigate().to(url3);
		String parentid = g.getWindowHandle();
		System.out.println(parentid);
	
		WebElement re = g.findElement(By.xpath("//span[@title='Remote']"));
		re.click();
		//After clicking on the remote tab,new window will open and Now we have to click on 
		// the Register button present in the new window.
		//for that, we have to switch focus of Selenium from old to new window.
		//And for that, first we have to know the windowhandle of the new window.
		//so,by using getWindowHandles() method ,we can get multiple handles.
		// and we can store that handles in Set interface of String type.
		// Now,to get particular new handle from Set Interface we are using For-each loop.
		Set<String> parentchildid = g.getWindowHandles();
		int count = parentchildid.size();
		System.out.println("Window handles = " + count);
		for(String ch : parentchildid) {
			if(!parentid.equals(ch)) {
				System.out.println("Switch the focus of Selenium to the new or child window/tab ");
				g.switchTo().window(ch);
				Thread.sleep(2000);
			 WebElement	reg = g.findElement(By.xpath("//a[@id='register_Layer']"));
			 reg.click();
			 WebElement na = g.findElement(By.xpath("//input[@id='name']"));
			 na.sendKeys("Akshay Kenjale");
			WebElement em = g.findElement(By.xpath("//input[@id='email']"));
			em.sendKeys("Kenjaleaksj");	
			}
		}
		g.switchTo().window(parentid);
		WebElement loc = g.findElement(By.xpath("//input[@placeholder='Enter location']"));
		loc.sendKeys("Pune");
		g.quit();
		
		
		
		
	
		
		}
	
	
	
	
	

}
