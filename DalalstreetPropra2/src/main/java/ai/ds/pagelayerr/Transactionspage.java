package ai.ds.pagelayerr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import ai.ds.testbase.Testbase;

public class Transactionspage extends Testbase{
	
	
	private By link_transactions = By.xpath("//a[contains(text(),'Transactions')]");
	
	
	public void clickOnTransactionslink() {
		
		driver.findElement(link_transactions).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	public void getTransactions(String filename) throws IOException {
		
	XSSFWorkbook wb = new XSSFWorkbook();
	
            XSSFSheet sheet = wb.createSheet("Trans");
            
            for(int i=0;i<10;i++) {
            	
            	XSSFRow row = sheet.createRow(i);
            	
            	for(int j=2;j<=9;j++) {
            		
            		XSSFCell cell= row.createCell(j-1);
            		
            		String ele = driver.findElement(By.
            				xpath("//table/tbody/tr["+ (i+1) +"]/td["+ j +"]")).getText();
            		
            		cell.setCellValue(ele);
           }
           }
            String path ="E:\\Practice TestData\\" + filename;
            FileOutputStream os = new FileOutputStream(path);
            
            wb.write(os);
            os.close();
		
	}
	

}
