package Pageobjectmode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation1.browse1;

public class Zerodaopen {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() {
	 driver=browse1.obrowser("https://www.google.com/");
	 }
	@AfterMethod
	public void closebrowser() throws IOException{
		browse1.screen(driver, "kite");
		driver.close();		
	}
	@Test
	public void sendID() throws InterruptedException, IOException {
	Zeroda zerodalogin = new Zeroda (driver);
	zerodalogin.googlesearch("www.kite.com");
	Thread.sleep(1000);
	zerodalogin.clickongoogleserach();
	zerodalogin.clickonkite();
	zerodalogin.senduserid("123456");
	Thread.sleep(2000);
	}
	@Test
	public void sendinpass() throws InterruptedException, IOException {
		Zeroda zerodapass =new Zeroda(driver);
		zerodapass.googlesearch("www.kite.com");
		Thread.sleep(2000);
		zerodapass.clickongoogleserach();
		zerodapass.clickonkite();
		zerodapass.senduserid("OKP335");
		zerodapass.sendpass("QAZ123456");
		Thread.sleep(1000);
		browse1.screen(driver, "kite");
		zerodapass.clickonlogin();
		Thread.sleep(1000);
		
	}
	
	
	
}
