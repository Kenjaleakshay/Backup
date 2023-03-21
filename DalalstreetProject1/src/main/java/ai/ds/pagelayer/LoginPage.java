package ai.ds.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement txtbox_email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtbox_password;

	@FindBy(xpath = "//button[text()='Log In']" )
	private WebElement button_login;
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmailid(String email) {
		
		txtbox_email.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		
		txtbox_password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		
		button_login.click();
	}
	
	public String getCurrentUrl() {
		
		String curl= driver.getCurrentUrl();
		return curl;
	}
}
