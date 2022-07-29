package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports generateReports() {
		ExtentSparkReporter htmlreporter=new ExtentSparkReporter("myreports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Project", "Zerodha");
		return extent;
	}

}
