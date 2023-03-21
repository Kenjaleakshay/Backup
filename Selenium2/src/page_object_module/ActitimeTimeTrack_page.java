package page_object_module;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTimeTrack_page {
	
	private WebElement newTask;
	private WebElement selectCustomer;
	private WebElement customername;
	private WebElement projectname;
	private WebElement taskname;
	private WebElement createtask;
	private WebElement time;
	private WebElement savecha;
	private WebElement viewTimeTrack; 
	WebDriver driver;
	
	public ActitimeTimeTrack_page(WebDriver driver) {
		
		this.driver=driver;
		newTask= driver.findElement(By.xpath("//span[@onclick='openAddNewTasksPopup();']"));
		
		
	
	}
	
   public void verifynewTask() throws InterruptedException {
	   
	  
	  String par = driver.getWindowHandle();
	  System.out.println(par);
	   newTask.click();
	   
	   Thread.sleep(3000);
	   Set<String> pchi = driver.getWindowHandles();
	   for(String ch : pchi) {
		   if(!par.equals(ch)) {
			   driver.switchTo().window(ch);
			   }
	   }
	   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
	   
	   selectCustomer = w.until(ExpectedConditions.visibilityOfElementLocated
			  (By.xpath("//button[text()='- Select Customer -']")));
	   selectCustomer.click();
	 
	  WebElement  newcustomer = driver.findElement(By.xpath("//ul[@class='x-menu-list']/li[2]"));
	 newcustomer.click();
	  WebDriverWait n = new WebDriverWait(driver,Duration.ofSeconds(2));
	//   List<WebElement> op = n.until(ExpectedConditions.
	//	   visibilityOfAllElementsLocatedBy(By.xpath("(//ul[@class='x-menu-list'])[2]")));
	
	 
	   
	 
	/* int count = op.size();
	 System.out.println(count);
	 
	 for(int i=0;i<count;i++){
		WebElement ele = op.get(i);
		String text= ele.getText();
		System.out.println(text);
		if(text.equals("- New Customer -")) {
			ele.click();
			System.out.println("if execurted");
		}
	 }*/
	  
	     customername = driver.findElement(By.xpath("//input[@id='createTasksPopup_newCustomer']"));
	     projectname = driver.findElement(By.xpath("//input[@id='createTasksPopup_newProject']"));
	     taskname = driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]"));
	     createtask = driver.findElement(By.xpath("//span[@class='buttonTitle']"));
	    
	     driver.switchTo().window(par);
	    // time = driver.findElement(By.xpath("//input[@name='timeTrack[1].spentStr[0]']"));
	    
	   
	   customername.sendKeys("Student17");
	   projectname.sendKeys("Training");
	   taskname.sendKeys("Advance Java");
	   createtask.click();
	  // time.sendKeys("3");
	   Thread.sleep(2000);
	   savecha = driver.findElement(By.xpath("//input[@id='SubmitTTButton']"));
	   Thread.sleep(1000);
	   savecha.click();
	   
}
   public void verifycalendardate() throws InterruptedException {
	
	   WebElement calen = driver.findElement(By.xpath("//button[@id='ext-gen10']"));
	   calen.click();
	   Thread.sleep(2000);
	    }
   
   public void setDate() throws InterruptedException {
	   
	   WebElement setdate= driver.findElement(By.xpath("//table[@id='ext-gen30']/tbody/tr[2]/td/table/tbody/tr[6]"));
	   setdate.click();
	   Thread.sleep(2000);
	    }
   
   public void verifyViewTimeTrack() throws InterruptedException {
	  
	   viewTimeTrack = driver.findElement(By.xpath("//a[text()='View Time-Track']"));
	 Thread.sleep(2000);
	   viewTimeTrack.click();
	   }
   
}
