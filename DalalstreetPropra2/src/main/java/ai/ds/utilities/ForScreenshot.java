package ai.ds.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import ai.ds.testbase.Testbase;

public class ForScreenshot extends Testbase {
	
	
	public void takeScreenshot(String filename) throws IOException {
		
		String path = "E:\\VelocityTraining\\setup\\EclipseIDE_2022_06\\Eclipse_workspace_2022_06"
				+ "\\DalalstreetPropra2\\Screenshots(failed_test)\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path + filename + ".png");
		
		FileHandler.copy(src, des);
		
		
		
	}

}
