package actitimesecond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_object_module.ActitimeLoginPage;

public class ExecutTask {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\VelocityTraining\\setup\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/login.do");
		
		ActitimeLoginPage l = new ActitimeLoginPage(driver);
		l.setActitimeusername();
		l.setActitimepass();
		l.verifylogin();
		
		Actitime_Taskspage t = new Actitime_Taskspage(driver);
		t.verifyTasks();
		
	}

}
