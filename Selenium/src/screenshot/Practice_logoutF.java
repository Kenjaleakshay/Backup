package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice_logoutF extends Launching {

	
	public void fblogout() throws InterruptedException {
		
		g.navigate().to("https://www.facebook.com/login/");
		WebElement el1 = g.findElement(By.xpath("//input[@name='email']"));
		el1.sendKeys("7276332709");
		WebElement el2 = g.findElement(By.xpath("//input[@name='pass']"));
		el2.sendKeys("jackreacher");
		 WebElement el3= g.findElement(By.xpath("//button[@value='1']"));
		 el3.click();
		 Thread.sleep(5000);
		 WebElement el4 = g.findElement(By.xpath("//div[@class='x1ey2m1c xds687c x47corl x10l6tqk x17qophe x13vifvy x19991ni x1dhq9h x1hc1fzr x1mq3mr6 x1wpzbip x14yjl9h xudhj91 x18nykt9 xww2gxu']"));
	     el4.click();
	
	}
}
