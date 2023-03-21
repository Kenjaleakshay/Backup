package practiceSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Monkey_Testing extends RelativeXpath{
	
	public void monkeytest() {
		
		int height = g.manage().window().getSize().getHeight();
		int width = g.manage().window().getSize().getWidth();
		System.out.println("Height is = "+ height + "\n" +  "Width is = "+ width );
		}
	
	public void monkeytest2() {
		
		Dimension size = g.manage().window().getSize();
		System.out.println("Height is = " + size.getHeight());
		System.out.println("Width is = " + size.getWidth());
	}
//to open the window in our desired size for that we 
	//first 1. We have to create the object of the Dimension class 
	//         (we have to provide size in constructor signature(w,h))
	//      2. Then,we have to use that object as argument in the setSize()method.
	
	public void settingsize() {
		
		Dimension f = new Dimension(300,500);
		g.manage().window().setSize(f);
	}
	
	public void settingpos() {
		
		Point pos = g.manage().window().getPosition();
		
		System.out.println("Point X = "+ pos.getX());
		System.out.println("Point Y = " + pos.getY());
		
		//to open the window at our desired position for that we 
		//first 1. We have to create the object of the point class 
		//      (we have to provide position or co-ordinates in constructor signature(x,y))
		//      2. Then,we have to use that object as argument in the setPosition()method.
			
		Point c = new Point(200,400);
		g.manage().window().setPosition(c);
	}
	
	
}
