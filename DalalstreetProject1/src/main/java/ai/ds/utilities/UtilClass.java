package ai.ds.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import ai.ds.testbase.TestBase;

public class UtilClass extends TestBase {
	
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	  static  LocalDateTime now = LocalDateTime.now();  
	  String h = dtf.format(now);
	  
	public static void takesshot(String Filename) throws IOException {
		
		String path = "E:\\VelocityTraining\\setup\\EclipseIDE_2022_06\\"
				+ "Eclipse_workspace_2022_06\\DalalstreetProject1\\Screenshots\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File file = ts.getScreenshotAs(OutputType.FILE);
		 File des  = new File(path+Filename+".png");
		 FileHandler.copy(file, des);
		
		
		//   System.out.println(dtf.format(now));  
		  
		
		
	}

}
