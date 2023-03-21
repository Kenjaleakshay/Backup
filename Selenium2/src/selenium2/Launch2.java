package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch2 implements Common_Prop {
	
	
	WebDriver g;
	
	public void launchbrowser() {
		
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
	}
	
	public void selctpractice() {
		
//here, we have to select the specific value from drop down webelement ,for that we have to use diff.
// methods like selectByIndex(index),selectByValue("value"),selectByVisibleText("text") but these
// methods are present in the Select class.So,first we have to create the object of Select class to
// to use or access the methods.		
//And while creating object we need to pass that specific WebElement (variable) as argument in 
//the constructor of the object of Select class.So, first we need to find that WebElement by using 
// findElement() method and store it in the WebElement type variable.	
		
		g.navigate().to(url1);
		 WebElement day = g.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select da = new Select(day);
		 da.selectByValue("29");
		 WebElement month = g.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select h = new Select(month);
		 h.selectByIndex(8);
		 WebElement year = g.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select n = new Select(year);
		 n.selectByVisibleText("1993");
// if we want to print all the values from year webelement , for that we can use getOptions() method 
// from Select class so,by  using select type variable we can access that method.
// Now we have to store these options(WebElements) in List<WebElement> type variable.then,
// we have to count the options by size() method from List interface after that by using count 
//we have to iterate the options(webelements) in for loop .
// We have get(i) method from List by which we can get value stored at particular index.after
// that we have to use getText() method which returns text format of the values.		 
		 List<WebElement>options = n.getOptions();
		  int count = options.size();
		  System.out.println("no. of options are "+count);
		  
		  
		  for(int i=0;i<count;i++) {
			  String text = options.get(i).getText();
			  System.out.println(text);
		  }
		  
		  
		  
	}

}
