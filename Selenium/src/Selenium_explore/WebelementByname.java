package Selenium_explore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementByname extends Launching_Browser {
	
	public void login() {
		System.setProperty(key1, value1);
		WebDriver u = new ChromeDriver();
		u.manage().window().maximize();
		u.get(url1);
		u.findElement(By.name("email")).sendKeys("7276332709");
		u.findElement(By.name("pass")).sendKeys("jackreacher");
		u.findElement(By.name("login")).click();
		//u.findElement(By.className("x1lliihq x1k90msu x2h7rmj x1qfuztq xcza8v6")).click();
		//u.findElement(By.linkText("Forgotten account?")).click();
       // u.findElement(By.partialLinkText("Sign up for Facebook")).click();
		u.close();
	}

}
