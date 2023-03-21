package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchandWait implements Common_propert{
	
	WebDriver g;
	
	public void launchchrome() {
		
		System.setProperty(key1, value1);
		g = new ChromeDriver();
		g.manage().window().maximize();
	}
	
	public void implicitwait() {
		
		g.navigate().to("https://paytm.com/recharge");
		
		//g.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// Above method is in the older version of selenium 3.14
// But,in newer version the method's syntax is updated.
		
		//g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e1 = g.findElement(By.xpath("//span[text()='DTH']"));
		boolean val = e1.isDisplayed();
	    if(val==true) {
	    	System.out.println("The Dth button is verified it is present");
	    }else {
	    	System.out.println("The Dth button is verified it is absent");
	    }
	    	
	    WebElement e2 = g.findElement(By.xpath("//label[@class='_3M_F']"));
		boolean val2 = e2.isDisplayed();
		if(val2==true) {
			System.out.println("Prepaid button presence verified and it is present");
		}else {
			System.out.println("Prepaid button presence verified and it is absent");
		}
		
		
		WebElement e3 = g.findElement(By.xpath("(//div[@class='_3QBN'])[3]"));
		boolean val3 = e3.isDisplayed();
		if(val3==true) {
			System.out.println("Investor relations is present");
		}else {
			System.out.println("Investor relations is absent");
		}
		}
	
	public void enabled() {
		
		g.navigate().to("https://paytm.com/recharge");
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement post = g.findElement(By.xpath("//input[@id='radio0']"));
		boolean val3= post.isEnabled();
		System.out.println(val3);
		if(val3==true) {
			System.out.println("postpaid is enabled");
		}else {
			System.out.println("postpaid is disabled");
		}
		
		WebElement e5 = g.findElement(By.xpath("//button[@class='_11kC  _15qf _2qE6']"));
		boolean val4 = e5.isEnabled();	
		if(val4==true) {
			System.out.println("Proced to recharge is enabled");
		}else {
			System.out.println("Proceed to recharge is disabled");
		}
	}
	
	public void selected() {
		
		g.navigate().to("https://paytm.com/recharge");
		
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement post = g.findElement(By.xpath("//input[@id='radio1']"));
		boolean val5 = post.isSelected();
		if(val5==true) {
			System.out.println("postpaid is selected");
		}else {
			System.out.println("postpaid is not selected");
		}
		}
	
	public void explicitwait() throws InterruptedException {
		
//Explicit wait = Waiting time + Condition		
//step 1 - We have to create the object of the WebDriverWait,while creating the object we have to
// pass the WebDriver type variable ,(And)Duration.ofSeconds(time) in the WebDriverWait constructor
//Step 2 - Checking the specific condition of specific webelement by using until method.
// until method is present in the WebDriverWait class.		
//We can access or call until method by WebDriverWait type variable and syntax is 	
//	var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")); this will return the 
// webelement , so we can store it in the WebElement type variable.		
		
		g.navigate().to("https://paytm.com/recharge");
		
		WebDriverWait wait = new WebDriverWait(g,Duration.ofSeconds(10));
		
		WebElement e1 = wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//img[@title='Jio Recharge']")));
		e1.click();
		Thread.sleep(2000);
		
		
		WebDriverWait hu = new WebDriverWait(g,Duration.ofSeconds(10));
		
		WebElement e2 = hu.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("(//div[@class='_3QBN'])[4]")));
		e2.click();
		
		WebDriverWait n = new WebDriverWait(g,Duration.ofSeconds(10));
		
		WebElement ji = n.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("(//div[@class='_3QBN'])[2]")));
		ji.click();
		
		}
	
	public void explicitwait2() {
		
		g.navigate().to("https://paytm.com/recharge");
		
		WebDriverWait o = new WebDriverWait(g,Duration.ofSeconds(10));
		
		WebElement e5 = o.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//span[contains(text(),'Prepaid/Postpaid')]")));
		e5.click();
		
		
		
		
		
		
	}

}
