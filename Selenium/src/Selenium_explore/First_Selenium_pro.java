package Selenium_explore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium_pro {

        // Configure the Tool with our Project
		// Create Main Method
		// Choice the browser for testing - ChromeDriver
		// Set up the Properties of Chrome Browser
		// Creation of ChromeDriver Object by giving reference of WebDriver Interface
		// Maximize The Browser
		// Open your Application/Software by Hitting correct URL
		// Selenium Version - 3.141.59
		// Latest Version - 4.0
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "E:\\VelocityTraining\\setup\\Chrome Driver\\chromedriver.exe" );
			WebDriver d = new ChromeDriver();
			//d.manage().window().maximize();
		//	d.get("https://www.facebook.com/signup");
			//d.manage().window().minimize();
			//.manage().window().maximize();
			
		}
	}

