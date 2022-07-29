package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener  {
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed successful");
	}
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.TakeScreenShot(driver, result.getName() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
