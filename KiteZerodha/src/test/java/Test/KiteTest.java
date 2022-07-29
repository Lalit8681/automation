package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.KiteLoginPage;
import utility.Excel;
import utility.Reports;
import utility.ScreenShot;

public class KiteTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void createReport() {
		extent=Reports.generateReports();
	}
	
	@BeforeMethod
	public void OpenBrowser() {
		driver=Browser.openBrowser();
	}
	@AfterTest
	public void TakeSS() throws IOException {
		extent.flush();
//		ScreenShot.TakeScreenShot(driver, "KiteTest2 ");
//		driver.close();		
	}
	
	@Test
	public void KiteLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		test=extent.createTest("KiteLogin");
		KiteLoginPage KiteLoginTest=new KiteLoginPage(driver);
		String userID=Excel.getData("Sheet1", 1, 1);
		String Pass=Excel.getData("Sheet1", 2, 1);
		String Lpin=Excel.getData("Sheet1", 4, 1);
		System.out.println(userID);
		System.out.println(Pass);
		System.out.println(Lpin);
		KiteLoginTest.enterUserId(userID);
		KiteLoginTest.enterPassward(Pass);
		KiteLoginTest.clickOnLogin();
//		Thread.sleep(3000);
		KiteLoginTest.enterPin(Lpin);
		KiteLoginTest.clickOnContinue();
//		Thread.sleep(2000);
		KiteLoginTest.SendSearchKey("TATASTEEL");
		KiteLoginTest.moveOnFirstResult(driver);
		KiteLoginTest.MoveOnBuy(driver);
		
		
	}
	@AfterMethod
	public void capctureResult(ITestResult  result){
		if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
	}
	

}
