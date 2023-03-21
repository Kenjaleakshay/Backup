package ai.ds.testlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ai.ds.pagelayer.DashboardPage;
import ai.ds.pagelayer.ExchangePage;
import ai.ds.testbase.TestBase;

public class Buyfunctionality extends TestBase{
	
	@DataProvider(name = "Stock names")
	public  Object[] dataprovider() throws EncryptedDocumentException, IOException {
		
		//String[] data = {"Axis","Wipro","Indian Railway"};
		String path = "E:\\TestData\\CompnyNames.xlsx";
		FileInputStream fi = new FileInputStream(path);
		
		 Workbook ex = WorkbookFactory.create(fi);
		 
		 ArrayList<String> al = new ArrayList<>();
		 
		 for(int i=2;i<=3;i++) {
			   String tem = ex.getSheet("TestData1").getRow(i).getCell(1).getStringCellValue();
			 al.add(tem);
		 }
		 
		 Object[] arr= al.toArray();
		return arr;
		
		//return data;
	}
	
	
	
	@Test(dataProvider = "Stock names")
	public void verifyBuyLongtermorder(String share) throws InterruptedException {
		
		
		 
		dash.enterCompanyname(share);
		dash.selectOption();
		Thread.sleep(2000);
		
		exch.clickOnBuylink();
		exch.clickOnLongterm();
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		exch.enterQuantity("1");
		Thread.sleep(2000);
		sc.executeScript("scrollBy(0,300)");
		Thread.sleep(2000);
		exch.clickOnBuybtn();
		Thread.sleep(2000);
		String exp = "Order Created successfully";
		String act = exch.getStatus();
		Assert.assertEquals(act,exp);
		logger.info("successful");	
	}
	
	
	

}
