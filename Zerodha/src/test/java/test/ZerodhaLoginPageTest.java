package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		 driver=Browser.ChromeBrowser();
	}
	
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage ZerodhaLogin = new ZerodhaLoginPage(driver);
		String userId=Excel.getData("Sheet1", 1, 1);
		String Pass=Excel.getData("Sheet1", 2, 1);
		String pin=Excel.getData("Sheet1", 3, 1);
		System.out.println(userId);
		System.out.println(Pass);
		ZerodhaLogin.enterUserId(userId);
		ZerodhaLogin.enterPassward(Pass);
		ZerodhaLogin.clickOnLogin();
//		Thread.sleep(1000);
		ZerodhaLogin.enterPin(pin);
		ZerodhaLogin.clickOnContinue();
	}

}
