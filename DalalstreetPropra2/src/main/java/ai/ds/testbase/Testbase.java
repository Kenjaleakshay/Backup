package ai.ds.testbase;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ai.ds.pagelayerr.Dashboardpage;
import ai.ds.pagelayerr.Exchangepage;
import ai.ds.pagelayerr.Loginpage;
import ai.ds.pagelayerr.Transactionspage;
import ai.ds.utilities.ForScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static Logger logger;
	public Loginpage lgin;
	public Dashboardpage das;
	public Exchangepage exc;
	public ForScreenshot fs;
	public Transactionspage tsc;
	
	@BeforeTest
	public void beforestart() {
		
	    logger = Logger.getLogger("Dalalstreet Automation Framework");
		PropertyConfigurator.configure("Log4J.properties");
	}
	
	@AfterTest
	public void aftertest() {
		
		logger.info("Framework exec ended");
	}
	
	@BeforeMethod
	public void launchstart() throws InterruptedException {
		
		String browser = "Google chrome";
		
		if(browser.equalsIgnoreCase("Google Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("Firefox Browser")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Internet Explorer")) {
			
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://apps.dalalstreet.ai/login");
		//driver.get("https://apps.dalalstreet.ai/login");
		
		 lgin = new Loginpage();
		 das = new Dashboardpage();
		 exc = new Exchangepage();
		 fs = new ForScreenshot();
		 tsc = new Transactionspage();
		 
		 lgin.enterEmailid();
			lgin.enterPassword();
			lgin.clickOnLogin();
			Thread.sleep(3000);
		 
		
		
		
	}
	
	
		
	
	
	@AfterMethod
	public void logout() {
		
		//driver.quit();
	}

}
