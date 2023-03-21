package Selenium_explore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEleBy_Abs_Xpath extends Launching_Browser {
	
	public void loginbyAbs_Xpath() {
		System.setProperty(key1, value1);
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get(url1);
		a.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div"
				+ "/div[2]/div[2]/form/div/div[1]/input")).sendKeys("7276332709");
		a.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/"
				+ "form/div/div[2]/div/div/input")).sendKeys("jackreacher");
		a.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/"
				+ "div/div[2]/div[2]/form/div/div[3]/button")).click();
		
	}

}
