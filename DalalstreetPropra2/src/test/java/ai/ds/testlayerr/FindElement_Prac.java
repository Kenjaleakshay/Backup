package ai.ds.testlayerr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_Prac {
	
	@Test
	public void Prac_WebElementfind() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=PNQ-DEL-15/02/2023_DEL-PNQ-16/02/2023&tripType=R&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,150)");
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='listingCardWrap'])[2]/div/div[1]"));
		Thread.sleep(1000);
		
		//(//div[@class='listingCardWrap'])[2]/div/div[2]//following-sibling::span[@class='boldFont blackText']
		String text = ele.findElement(By.name("label")).getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
