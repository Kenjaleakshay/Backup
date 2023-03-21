package ai.ds.pagelayer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import ai.ds.testbase.TestBase;

public class TransactionsPage extends TestBase {
	
	private By data0 = By.xpath("//table/tbody/tr[1]/td[2]");
	
	public void getData0() {
		
		 String data12 = driver.findElement(data0).getText();
		 System.out.println(data12);
	}
	
	public void getAlldata() throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sh = book.createSheet("Transactions");
		
		
		for (int i=1; i<=10; i++) {
			
			 XSSFRow row = sh.createRow(i);

			for(int j=2; j<=9; j++) {
				
				String tempd = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"))
						.getText();
				XSSFCell cell  = row.createCell(j);
				cell.setCellValue(tempd);
			}
		}
		
		String pat = "E:\\Amar Waghmare\\PracticeDataDriven\\TransactionsData3.xlsx";
		FileOutputStream out = new FileOutputStream(pat);
		
		book.write(out);
		System.out.println("Excel file generated");
		out.close();
	}
	
	

}
