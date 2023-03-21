package ai.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class DashboardPage extends TestBase {
	
	 private By txtbox_search = By.xpath("(//input[@class='form-control'])[1]");
	
	 private By option = By.xpath("(//div[@class='m-2 card-title'])[2]");
	 
	 private By link_transactions = By.xpath("//a[text()='Transactions']");
	
	// public DashboardPage() {
		 
	//	 PageFactory.initElements(driver,this);
	// }
	
	
	public void enterCompanyname(String company) {
		
		driver.findElement(txtbox_search).sendKeys(company);
	}
	
	public void selectOption() {
		
		driver.findElement(option).click();
	}
	
	public void clickOnTransactions() {
		
		driver.findElement(link_transactions).click();
	}

	
	
	
}
