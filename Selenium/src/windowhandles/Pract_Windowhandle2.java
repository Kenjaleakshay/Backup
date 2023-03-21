package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pract_Windowhandle2 extends Pract_Windowhadle{
	
	public void prac2() throws InterruptedException {
		
		g.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String par2 = g.getWindowHandle();
		System.out.println("Par2 is "+par2);
		WebElement l2 = g.findElement(By.xpath("//a[2]"));
		l2.click();
		Thread.sleep(1000);
		Set<String> parchi2 = g.getWindowHandles();
		for(String ch2 : parchi2) {
			if(!par2.equals(ch2)) {
				g.switchTo().window(ch2);
				WebElement emi = g.findElement(By.xpath("//input[@name='email']"));
				emi.sendKeys("7276332709");
				WebElement pas = g.findElement(By.xpath("//input[@name='pass']"));
				pas.sendKeys("jackreacher");
				WebElement log = g.findElement(By.xpath("//button[@value='1']"));
				log.click();
				Thread.sleep(6000);
				}
			}
		g.switchTo().window(par2);
		WebElement li2 = g.findElement(By.xpath("//a[contains(text(),'2021')]"));
		li2.click();
		Thread.sleep(3000);
		g.quit();
		}
	
	public void prac3() throws InterruptedException {
		
		g.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		WebElement l3 = g.findElement(By.xpath("//a[text()=' Click this link to start  Session in same window']"));
		l3.click();
		WebElement emi = g.findElement(By.xpath("//input[@name='email']"));
		emi.sendKeys("7276332709");
		WebElement pas = g.findElement(By.xpath("//input[@name='pass']"));
		pas.sendKeys("jackreacher");
		WebElement log = g.findElement(By.xpath("//button[@value='1']"));
		log.click();
		Thread.sleep(4000);
		g.navigate().back();
		Thread.sleep(2000);
		g.navigate().back();
		Thread.sleep(2000);
		WebElement li4 = g.findElement(By.xpath("//a[contains(text(),'2019')]"));
		li4.click();
		Thread.sleep(4000);
		g.quit();
	}
	

}
