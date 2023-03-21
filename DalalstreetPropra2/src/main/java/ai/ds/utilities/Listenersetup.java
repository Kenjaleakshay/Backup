package ai.ds.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.ds.testbase.Testbase;

public class Listenersetup extends Testbase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("test execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("test executiom successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("test executiom failed");
		try {
			ForScreenshot fs = new ForScreenshot();
			fs.takeScreenshot(result.getName() + System.currentTimeMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("Screenshot taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("test executiom skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
