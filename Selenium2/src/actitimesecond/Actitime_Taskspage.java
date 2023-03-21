package actitimesecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actitime_Taskspage {
	
	private WebElement tasks;
	private WebElement filterbyname;
	
	public Actitime_Taskspage(WebDriver driver) {
		
	 tasks = driver.findElement(By.xpath("//div[text()='Tasks']"));
		
	}
	
	public void verifyTasks() {
		
		tasks.click();
		
		
		
	}

}
