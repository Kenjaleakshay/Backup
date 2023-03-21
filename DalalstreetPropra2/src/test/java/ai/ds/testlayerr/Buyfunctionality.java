package ai.ds.testlayerr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ai.ds.testbase.Testbase;

public class Buyfunctionality extends Testbase {
	
	@DataProvider(name = "Stock names")
	public String[] dataprovider() throws EncryptedDocumentException, IOException {
		
		String path = "E:\\TestData\\StocknamePra.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		String[] ar = new String[3];
		int j = 0;
		
		for(int i=2;i<=4;i++) {
			String temp = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			
			ar[j] = temp;
			j++;
			}
		return ar;
		
		}
	
	@Test(dataProvider = "Stock names")
	public void verifyBuyFunctionality(String stk) throws InterruptedException {
		
		 das.enterStockName(stk);
		    das.selectOption();
		    Thread.sleep(3000);
		    exc.clickOnLongterm();
		    exc.enterQuantity();
		   Thread.sleep(1000);
		    
		    JavascriptExecutor js =(JavascriptExecutor)driver;
		    js.executeScript("scrollBy(0,300)");
		    Thread.sleep(1000);
		    exc.clickOnBuybtn();
		    logger.info("Buy btn clicked");
		    Thread.sleep(2000);
		    String act = exc.getAlertmsg();
		    String exp = "Order Created successfully";
		    Assert.assertEquals(act,exp);
		    logger.info("elements asserted");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* @Test
	public void verifyBuyfunctionality() throws InterruptedException {
		
    das.enterStockName("Indian Railway");
    das.selectOption();
    Thread.sleep(3000);
    exc.clickOnLongterm();
    exc.enterQuantity();
   Thread.sleep(1000);
    
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("scrollBy(0,300)");
    Thread.sleep(1000);
    exc.clickOnBuybtn();
    Thread.sleep(2000);
    String act = exc.getAlertmsg();
    String exp = "Order Created successfully";
    Assert.assertEquals(act,exp);
   
    
    
    
    
    
    
	 }
*/
}
