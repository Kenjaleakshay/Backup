package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract_Windowhadle extends Launching_Browser3{
	
	WebDriver g;
	
	public void launchurl() {
		
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		
	}
	
	public void prac1() throws InterruptedException {
		
		g.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String par1 = g.getWindowHandle();
		System.out.println("Par1 is " + par1);
		Thread.sleep(3000);
		WebElement l1 = g.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/a[1]"));
		l1.click();
		Thread.sleep(4000);
		Set<String> parchi1 = g.getWindowHandles();
		for(String ch1 : parchi1) {
			 System.out.println(ch1);
			if(!par1.equals(ch1)) {
				g.switchTo().window(ch1);
				WebElement inp = g.findElement(By.xpath("//input[@name='q']"));
				inp.sendKeys("Velocity");
				WebElement but = g.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
				but.click();
				Thread.sleep(4000);
			}
		}
		g.switchTo().window(par1);
		Thread.sleep(3000);
		WebElement ll = g.findElement(By.xpath("//a[contains(text(),'2022')]"));
		ll.click();
		Thread.sleep(3000);
		g.quit();
		
		
	}
	

}
