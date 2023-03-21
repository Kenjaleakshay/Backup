package selenium2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pop_up extends Launch2 {
	
//Here , we have to perform action on button which are on the pop-up window. For that we have to
// switch the focus of selenium from parent window to alert pop-up so for that we use 
//driver.switchTo().alert() after that for ok we use accept() and for cancel we use dismiss() 
// method after alert() method.And for entering text sendKeys() after alert().
// and for getting text shown on the alert we use getText() after alert().	
	public void popup() throws InterruptedException {
		
		g.navigate().to("https://demoqa.com/alerts");
		WebElement e1 = g.findElement(By.xpath("//button[@id='alertButton']"));
		e1.click();
		Thread.sleep(2000);
		g.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement e2 = g.findElement(By.xpath("//button[@id='timerAlertButton']"));
		e2.click();
		Thread.sleep(7000);
		g.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement e3 = g.findElement(By.xpath("//button[@id='confirmButton']"));
		e3.click();
		Thread.sleep(2000);
		String te = g.switchTo().alert().getText();
		System.out.println("Text is "+te);
		Thread.sleep(2000);
		g.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement e4 = g.findElement(By.xpath("//button[@id='promtButton']"));
		e4.click();
		Thread.sleep(2000);
		g.switchTo().alert().sendKeys("eeeee");
		g.switchTo().alert().accept();
	}
	
	public void pracpopup() throws InterruptedException {
		
		g.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		WebElement e1 = g.findElement(By.xpath("//input[@name='cusid']"));
		e1.sendKeys("jsjsjs");
		Thread.sleep(2000);
		WebElement e2 = g.findElement(By.xpath("//input[@name='submit']"));
		e2.click();
		Thread.sleep(2000);
		g.switchTo().alert().accept();
		Thread.sleep(3000);
		g.switchTo().alert().accept();
		g.close();
			}

	public void popup2() throws InterruptedException {
		
		g.navigate().to(" http://demo.guru99.com/popup.php");
		String par = g.getWindowHandle();
		 System.out.println(par);
		WebElement e1 = g.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        e1.click();
        Thread.sleep(4000);
        Set<String> hand = g.getWindowHandles();
        Thread.sleep(4000);
	   for(String ch : hand) {
		   if(!par.equals(ch)) {
			   g.switchTo().window(ch);
			   System.out.println(ch);
			   Thread.sleep(2000);
			   System.out.println("Window switched");
			  
			   
		   }
		   }
	   WebElement e2 = g.findElement(By.xpath("//input[@name='emailid']"));
	   e2.sendKeys("kenjale.akshayc@gmail.com");
	   WebElement e3 = g.findElement(By.xpath("//input[@name='btnLogin']"));
	   e3.click();
	   Thread.sleep(3000);
	   WebElement e4 = g.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
	   e4.click();
	   Thread.sleep(3000);
	   g.switchTo().window(par);
	   g.quit();
	
	
	
	}
}
