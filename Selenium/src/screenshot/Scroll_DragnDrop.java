package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Scroll_DragnDrop extends Launching {
	
	public void scrollndrag() {
		
		g.navigate().to("https://jqueryui.com/droppable/");
// For Scrolling up,down,we use the executeScript method present in the JavascriptExecutor Interface
// which is child to the WebDriver interface like TakesScreenshot interface.
//and we have to pass co-ordinates as arguments in executeScript("scroll(x,y)").
//To use the method first, we have to type cast the WebDriver variable to the JavaScriptExecutor variable.
		
		JavascriptExecutor m = (JavascriptExecutor)g;
		m.executeScript("scroll(0,270)");
		
		
		WebElement element = g.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		g.switchTo().frame(element);
		
// For drag and drop mouse action , we use dragAndDrop method present in the Actions Class.
// So first we have to create object of Actions Class and in the constructor of it we have to pass 
// the WebDriver variable.	
// After that , we use the command as refvariable.dragAndDrop(ele1,ele2).perform();
// for all the actions class methods at the end we have use perform().
		
		WebElement ele1 = g.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2 = g.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions x = new Actions(g);
		x.dragAndDrop(ele1, ele2).perform();
		
//Actions class has diff. methods like click(),doubleClick(),contextClick() for diff. mouse actions.
		
		
			
		
		
	}

}
