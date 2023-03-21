package selenium2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hard_prac extends Launch2 {
	
	public void practice1() throws InterruptedException {
		
		g.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String par1= g.getWindowHandle();
		System.out.println("parent handle = "+par1);
		WebElement e1 = g.findElement(By.xpath("//button[@id='newWindowBtn']"));
		e1.click();
		Thread.sleep(2000);
		Set<String> hans = g.getWindowHandles();
		for(String ch : hans) {
			if(!par1.equals(ch)) {
				g.switchTo().window(ch);
				g.manage().window().maximize();
				
			}
		}
		WebElement e2 = g.findElement(By.xpath("//a[contains(text(),'Selenium Practice')]"));
		Actions s = new Actions(g);
		s.moveToElement(e2).perform();
		Thread.sleep(7000);
		List<WebElement> all = g.findElements(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li"));
		int count = all.size();
		System.out.println("No of elements are "+count);
		
		for(int i=0; i<count ; i++) {
			WebElement e4 = all.get(i);
			
			try {
			String text = e4.getAttribute("innerHTML");
			System.out.println(text);
			if (text.contains("XPath Practice")) {
				e4.click();
				Thread.sleep(8000);
				System.out.println("Xpath prac clicked");}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		
			
			}
		g.navigate().back();
		Thread.sleep(5000);
		g.switchTo().window(par1);
		Thread.sleep(5000);
		g.quit();
		System.out.println("all executed");
		}



   public void prac2() {
	   
	   g.navigate().to("https://nxtgenaiacademy.com/demo-site/");
	   
	   JavascriptExecutor js = (JavascriptExecutor)g;
	   js.executeScript("scroll, (0,100)");
	   WebElement e1 = g.findElement(By.xpath("//select[@name='vfb-13[country]']"));
       Select s1 = new Select(e1);
       s1.selectByValue("India");
       WebElement e2 = g.findElement(By.xpath("//input[@name='vfb-18']"));
       e2.click();
       WebElement e3 = g.findElement(By.xpath("//input[@id='vfb-18']"));
	   e3.sendKeys("09/29/1993");
	   
	   WebElement e4 = g.findElement(By.xpath("//select[@name='vfb-16[hour]']"));
	   Select s2 = new Select(e4);
	   s2.selectByValue("16");
	
// We have getOptions() method from Select class which returns all the options(webelements)
//from specified WebElement , we can store these in List<WebElement> type variable.
//get(i) method from List Interface returns the webelement at particular index.After the get(i)
// method we can use getText() method which will return the text from the webelement at particular
// index.We can store it in the String type variable and print it.
// We also have getText() method from WebElement interface.	   
// 	   
	   
	   List<WebElement> els = s2.getOptions();
	   int count = els.size();
	   System.out.println("No. of options " +count);
	   
	   
	     for(int i=0; i<count; i++) {
		   WebElement el5 = els.get(i);
		   System.out.println(el5);
		  
		   String text = els.get(i).getText();
		System.out.println(text);
		System.out.println("This is from List getText");
		
		String textwebele = el5.getText();
		System.out.println(textwebele);
		   
		   }
	}
   
   public void prac3() throws InterruptedException {
	   
	   g.navigate().to("https://nxtgenaiacademy.com/demo-site/");
	   String par = g.getWindowHandle();
	   WebElement e1 = g.findElement(By.xpath("//button[@name='multiplewindows']"));
	   e1.click();
	   Thread.sleep(2000);
	   WebElement e2 = g.findElement(By.xpath("//button[@name='newbrowserwindow123']"));
	   e2.click();
	   Thread.sleep(2000);
	   
	   Set<String> ss= g.getWindowHandles();
	   
	   for(String ch : ss) {
		   if(!par.equals(ch)) {
			   g.switchTo().window(ch);
			   g.manage().window().maximize();
		   }
	   }
	   WebElement e3 = g.findElement(By.xpath("//li[@id='menu-item-4131']"));
	   Actions a = new Actions(g);
	   a.moveToElement(e3).perform();
	   
	   List<WebElement> li = g.findElements(By.xpath("//ul/li/a/span"));
	   int count = li.size();
	   System.out.println("No of elements "+count);
	   
	   for(int i=0; i<37; i++) {
		   WebElement e5 = li.get(i);
		   String text = e5.getAttribute("innerHTML");
		   System.out.println(text);
		   if(text.equals("A to Z Automation Training")) {
			   e5.click();
		   }
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}