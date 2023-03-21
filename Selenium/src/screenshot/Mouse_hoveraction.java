package screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hoveraction extends Launching {
	
	
	public void mousehover() throws InterruptedException {
		
		g.navigate().to("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
//to perform any mouse action , there are some pre-defined methods for diff. mouse actions present in
//the Actions class.
//so, for mouse hover ,we have moveToElement method in Actions class but to access this method
//first we need to create object of Actions class.	And while creating object we have to pass the 
// WebDriver type variable as argument in the constructor of Actions class.
//After that, by using that Actions class variable we can access the method moveToElement() 
//but first we have to locate the webelement and store it the in WebElement type variable.
// and pass that variable as argument in the moveToElement() method.
		
		
		WebElement ele1 = g.findElement(By.xpath("//button[@class='dropbtn']"));
		
		Actions l = new Actions(g);
		l.moveToElement(ele1).perform();
		
		//WebElement eld = g.findElement(By.xpath("(//div[@class='dropdown-content']/a)[3]"));
	//	eld.click();
//Now,due to mouse hover, we can see multiple diff. elements/links which will take us to the next page
//by clicking on  them.
//But, we can store these webelements List of (webelement) type variable by using findElements()method
//for that we have to give relative xpath of links such that find bar shows 1 of n 
//so by using this findElements() method we can return multiple webelements which we can store in List		
		 List<WebElement> elements = g.findElements(By.xpath("//div[@class='dropdown-content']/a"));
	       int count = elements.size();
	       System.out.println("toatal webelements are = "+count);
	       
	       for(int i=0;i<count;i++) {
	    	  WebElement ele2 = elements.get(i);
	    	  String text = ele2.getAttribute("innerHTML");
	    	  System.out.println(text);
	    	  if(text.equals("TestNG")) {
	    		  ele2.click();
	    	  }
	       }
	       Thread.sleep(3000);
	       g.quit();
	        g.navigate().back();
	
	
	
	}
	
	

}
