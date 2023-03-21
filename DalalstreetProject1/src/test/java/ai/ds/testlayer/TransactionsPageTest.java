package ai.ds.testlayer;

import java.io.IOException;

import org.testng.annotations.Test;

import ai.ds.testbase.TestBase;

public class TransactionsPageTest extends TestBase{
	
	@Test
	public void getAllTransactionsData() throws InterruptedException, IOException {
		
		dash.clickOnTransactions();
		Thread.sleep(3000);
		trans.getData0();
		trans.getAlldata();
	}
	

}
