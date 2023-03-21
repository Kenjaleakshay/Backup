package page_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/login.do");
		
		ActitimeLoginPage a = new ActitimeLoginPage(driver);
		a.setActitimeusername();
		a.setActitimepass();
		a.verifylogin();
		
		
		ActitimeTimeTrack_page b = new ActitimeTimeTrack_page(driver);
		
		b.verifycalendardate();
		b.setDate();
		b.verifynewTask();
		b.verifyViewTimeTrack();
	}

}
