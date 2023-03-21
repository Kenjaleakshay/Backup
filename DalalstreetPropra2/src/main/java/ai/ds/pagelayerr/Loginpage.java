package ai.ds.pagelayerr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.Testbase;

public class Loginpage extends Testbase {
	
	
	private By txtbox_emailid = By.xpath("//input[@name='email']");
	
	
	private By txtbox_password = By.xpath("//input[@name='password']");

	
	private By button_login = By.xpath("//button[text()='Log In']");
	
	
	
	//public Loginpage(){
		
	//	PageFactory.initElements(driver,this);
		
	//	}
	
	public void enterEmailid() {
		
	driver.findElement(txtbox_emailid).sendKeys("kenjale.akshayc@gmail.com");
	}
	
	public void enterPassword() {
		
		driver.findElement(txtbox_password).sendKeys("7276332709");
	}
	
	public void clickOnLogin() {
		
		driver.findElement(button_login).click();
	}
	
	
	
}
