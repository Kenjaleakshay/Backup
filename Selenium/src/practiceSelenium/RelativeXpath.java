package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath implements Common_Prop2{
	
	WebDriver g;
	
	public void RelXpath() {
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		g.navigate().to(url1);
		
		//Std Syntax = //Tagname[@AttributeName='AttributeValue']
		
		WebElement emil = g.findElement(By.xpath("//input[@name='email']"));
		emil.sendKeys("7276332709");
		WebElement pwd = g.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("jackreacher");
		WebElement but = g.findElement(By.xpath("//button[@name='login']"));
		but.click();
		g.close();
		
		}
	
	public void launchurl() {
		
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
		g.navigate().to(url1);
		
		}
	
	public void rel_Textfun() {
		
		//Rel Xpath by text Function
		//Std Syntax = //Tagname[text()='TxtValue']
		//Std Syntax = //Tagname[taxt()='txtvalue']
		WebElement sig = g.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		sig.click();
		
		//this can only be used for links web element(which have text) on web page.
		}
	
	public void rel_contains() {
		
		//a)By attribute use is same as that of attribute
		//Std Syntax = //Tagname[contains(@Attribtename,'Attributevalue')]
		//Std Syntax = //Tagname[contains(@Attributename,'Attributevalue')]
		
		WebElement r = g.findElement(By.xpath("//input[contains(@name,'email')]"));
		r.sendKeys("7276332709");
		WebElement jj = g.findElement(By.xpath("//input[contains(@id,'pass')]"));
		jj.sendKeys("jackreacher");
		
		}
	
	public void rel_containsb() {
		
		//b)By text function
		//Std Syntax = //tagname[contains(text(),'textvalue')]
		//Std Syntax = //tagname[contains(text(),'txtvalue')]
		
		WebElement f = g.findElement(By.xpath("//a[contains(text(),'Forgotten account')]"));
		f.click();

		//this can only be used for links web element(which have text) on web page.
	}

}
