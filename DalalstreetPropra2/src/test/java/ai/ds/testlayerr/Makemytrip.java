package ai.ds.testlayerr;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip {
	
	@Test
	public void prac() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='calc60'])[1]")).click();
		
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("New Delhi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='calc60'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-cy='handleSnackbarClose']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@aria-selected='true'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Select return Date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@aria-selected='true'])[1]/"
				+ "following::div[@aria-disabled='false'][2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		Thread.sleep(1000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,200)");
		Thread.sleep(1000);
		
	String comp = driver.findElement(By.xpath("(//span[@class='boldFont blackText'])[1]")).getText();
	System.out.println(comp);
	Thread.sleep(2000);
	String ticket1 = driver.findElement(By.xpath("(//p[@class='blackText fontSize16 blackFont'])[1]")).getText();
	System.out.println(ticket1);
	
		List<WebElement> flights= driver.findElements(By.xpath("(//div[@class='listingCardWrap'])[2]/div/child::div"));
		Thread.sleep(2000);
		System.out.println(flights.size());
		
		
		//WebElement flight = flights.stream().filter(s->
	//	s.findElement(By.xpath("//following-sibling::span[@class='boldFont blackText']")).getText().equals(comp)).findFirst().orElse(null);
			
		//String ticket = flight.findElement(By.xpath("//child::div[@class='makeFlex column relative splitfare ']")).getText();
		
		//System.out.println(ticket);
		
	/*	for(WebElement flight: flights) {
			
			Thread.sleep(2000);
			String temp = flight.getText();
			System.out.println(temp);
			Thread.sleep(2000);
			if(temp.contains(comp)) {
				String ticket = flight.findElement(By.xpath("child::div[@class='makeFlex column relative splitfare ']")).getText();
		System.out.println(ticket);
				break;
			}
			
		}*/
		
		String ticket2 = "";
		for(int i=1;i<=flights.size();i++) {
			
		 WebElement fname =  driver.findElement(By.
				 xpath("(//div[@class='listingCardWrap'])[2]/div/child::div["+i+"]//following-sibling::span[@class='boldFont blackText']"));
		 String temp= fname.getText();
			if(temp.equals(comp)) {
				
				fname.click();
				 ticket2 = driver.findElement(By.xpath("(//div[@class='listingCardWrap'])[2]/div/child::div["+i+"]//child::div[@class='makeFlex column relative splitfare ']")).getText();
				System.out.println(ticket2);
				break;
			}
			}
		
	/*	String temp = ticket1.substring(2);
		String[] ar= temp.split(",");
		String tempo = "";
		
		for(int i=0;i<ar.length;i++) {
			
			tempo = tempo + ar[i];
		}
		int a = Integer.parseInt(tempo);
		
		String var = ticket2.substring(2);
		 String[] arr= var.split(",");
		String tempo2 = "";
		
		for(int i=0;i<arr.length;i++) {
			
			tempo2 = tempo2 + arr[i];
		}*/
		
		String[] ar = {ticket1,ticket2};
		
		int[] tk = new int[2];
		
		for(int i=0;i<ar.length;i++) {
			
			String temp = ar[i].substring(2);
			String[] arr= temp.split(",");
			String tempo = "";
			for(int j=0;j<arr.length;j++) {
				
				tempo = tempo + arr[j];
			}
			int a = Integer.parseInt(tempo);
			tk[i] = a;
		}
		
		int b = tk[0] + tk[1];
		System.out.println(b);
		
			
			
			
			
			
			
		
		
		
		
		
		
		
	}

}
