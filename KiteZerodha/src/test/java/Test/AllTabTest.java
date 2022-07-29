package Test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import pojo.Browser;
import pom.KiteLoginPage;
import utility.Excel;
import utility.Reports;
import utility.ScreenShot;
//@Listeners(utility.Listeners.class)
public class AllTabTest {
	WebDriver driver;
	ExtentReports extent;
	@BeforeTest
	public void createReport() {
		extent=Reports.generateReports();
	}
	
	@BeforeMethod
	public void openBrowser() throws EncryptedDocumentException, IOException {
		driver=Browser.openBrowser();
		KiteLoginPage KiteLoginPage=new KiteLoginPage(driver);
		String userID=Excel.getData("Sheet1", 1, 1);
		String Pass=Excel.getData("Sheet1", 2, 1);
		String Lpin=Excel.getData("Sheet1", 4, 1);
		KiteLoginPage.enterUserId(userID);
		KiteLoginPage.enterPassward(Pass);
		KiteLoginPage.clickOnLogin();
		KiteLoginPage.enterPin(Lpin);
		KiteLoginPage.clickOnContinue();
		System.out.println("Test Start");
		}
	@AfterMethod
	public void ScreenShott() throws IOException {
		ScreenShot.TakeScreenShot(driver,"Kitef");
		System.out.println("ScreenShotTaken");

	}
	
	@Test(priority=1)
	public void ClickOnBuy() {
		KiteLoginPage KiteLoginPage=new KiteLoginPage(driver);
		KiteLoginPage.SendSearchKey("TATASTEEL");
		KiteLoginPage.moveOnFirstResult(driver);
		KiteLoginPage.MoveOnBuy(driver);
		
	}
	
	@Test(priority=2)
	public void ClickOnSell() {
		KiteLoginPage KiteLoginPage=new KiteLoginPage(driver);
		KiteLoginPage.SendSearchKey("TATASTEEL");
		KiteLoginPage.moveOnFirstResult(driver);
		KiteLoginPage.MoveOnSell(driver);
	
	}
	@Test(priority=3)
	public void ClickOnMarketDepth() {
		KiteLoginPage KiteLoginPage=new KiteLoginPage(driver);
		KiteLoginPage.SendSearchKey("ZOMATO");
		KiteLoginPage.moveOnFirstResult(driver);
		KiteLoginPage.MoveOnMarketDepth(driver);
	
	}
	
	

}
