package ai.ds.pagelayerr;

import org.openqa.selenium.By;

import ai.ds.testbase.Testbase;

public class Exchangepage extends Testbase {
	
	private By button_longterm = By.xpath("(//label[text()='Long-term'])[1]");

	private By txtbox_quantity = By.xpath("//input[@name='input-Qunatity']");
	
	private By button_buy = By.xpath("//button[text()='Buy']");
	
	private By alert_msg = By.xpath("(//div[text()='Order Created successfully'])[2]");
	
	
	public void clickOnLongterm() {
		
		driver.findElement(button_longterm).click();
	}
	
	public void enterQuantity() {
		
		driver.findElement(txtbox_quantity).click();
		driver.findElement(txtbox_quantity).sendKeys("1");
	}
	
	public void clickOnBuybtn() {
		
		driver.findElement(button_buy).click();
	}
	
	public String getAlertmsg() {
		
		 String msg = driver.findElement(alert_msg).getText();
		 return msg;
	}
	
	
	
	
	
	
	
}
