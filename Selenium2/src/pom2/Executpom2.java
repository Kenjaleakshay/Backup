package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executpom2 {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.navigate().to("http://localhost/login.do");
		
		Actitimeloginpage v = new Actitimeloginpage(w);
		v.setusername();
		v.setpass();
		v.login();
		
		
		
		
		
		
		
		
		
	}
}
