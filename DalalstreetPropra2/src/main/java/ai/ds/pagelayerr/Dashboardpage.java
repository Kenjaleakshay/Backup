package ai.ds.pagelayerr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.Testbase;

public class Dashboardpage extends Testbase {
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement txtbox_search;

	@FindBy(xpath = "(//div[@class='m-2 card-title'])[2]")
	private WebElement suggestion;
	
	
	public Dashboardpage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void enterStockName(String stock) {
		
		txtbox_search.sendKeys(stock);
		
	}
	
	public void selectOption() {
		
		suggestion.click();
	}
	
	
	
	
	
}
