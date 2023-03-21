package ai.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class ExchangePage extends TestBase {
	
	 private By link_buy = By.xpath("//a[text()='Buy']");

	  private By btn_longterm = By.xpath("//label[@for='btnradio1']");
	  
	  private By txtbox_quantity = By.xpath("//input[@name='input-Qunatity']");
	  
	  private By btn_buy = By.xpath("//button[contains(text(),'Buy')]");
	  
	  private By statusmsg = By.xpath("(//div[text()='Order Created successfully'])[2]");
	  
	 // public ExchangePage(){
	//	  PageFactory.initElements(driver,this);
	 // }
	  
	  public void clickOnBuylink() {
		  
		  driver.findElement(link_buy).click();
		  }
	  
	  public void clickOnLongterm() {
		  
		  driver.findElement(btn_longterm).click();
	  }
	  
	  public void enterQuantity(String qty) {
	  
	  driver.findElement(txtbox_quantity).click();
	  driver.findElement(txtbox_quantity).sendKeys(qty);
	  }
	  
	  public void clickOnBuybtn() {
		  
		  driver.findElement(btn_buy).click();
	  }
	  
	  public String getStatus() {
		  
		   String st = driver.findElement(statusmsg).getText();
		   return st;
	  }
	  
	  
	  
	  
}
