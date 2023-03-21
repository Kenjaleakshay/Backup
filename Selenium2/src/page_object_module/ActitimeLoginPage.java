package page_object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPage {
	
	private WebElement username;
    private WebElement pass;
    private WebElement login;
    
    public ActitimeLoginPage(WebDriver driver) {
    	
    	username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
    	pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    	login = driver.findElement(By.xpath("//a[@id='loginButton']"));
    }
    
    public void setActitimeusername() {
    	
    	username.sendKeys("admin");
    }
    public void setActitimepass() {
    	
    	pass.sendKeys("manager");
    }
    public void verifylogin() {
    	
    	login.click();
    }
}
