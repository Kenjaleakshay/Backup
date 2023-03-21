package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimeloginpage {
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pass;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement login;
	
	
	public Actitimeloginpage(WebDriver g) {
		
		PageFactory.initElements(g,this);
		
		}
	
	public void setusername() {
		
		username.sendKeys("admin");
	}
	
	public void setpass() {
		
		pass.sendKeys("manager");
	}
	
	public void login() {
		
		login.click();
	}

}
