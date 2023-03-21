package ai.ds.testbase;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ai.ds.pagelayer.DashboardPage;
import ai.ds.pagelayer.ExchangePage;
import ai.ds.pagelayer.LoginPage;
import ai.ds.pagelayer.TransactionsPage;
import ai.ds.utilities.UtilClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static Logger logger;
	public static WebDriver driver;
	public LoginPage lgin;
	public DashboardPage dash ;
     public ExchangePage exch ;
     public TransactionsPage trans;
  
     @BeforeTest
	public void start() {
		
	 logger = Logger.getLogger("Dalalstreet Automation Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Execution started");
	}
     
     @AfterTest
     public void end() {
    	 
    	 logger.info("Execution Ended");
     }
     
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		String br = "chrome";
		
		if(br.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			}
		else if(br.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://apps.dalalstreet.ai/login");
	logger.info("Chrome launched,maximized");
	
		lgin = new LoginPage();
		dash = new DashboardPage();
		exch = new ExchangePage();
		trans = new TransactionsPage();
	
		
		lgin.enterEmailid("kenjale.akshayc@gmail.com");
		lgin.enterPassword("7276332709");
		lgin.clickOnLogin();
		Thread.sleep(3000);
		logger.info("log in done");
	}

	@AfterMethod
	public void teardown() {
		
		//driver.quit();
	}
	
	
}
