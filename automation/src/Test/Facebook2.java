package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation1.browse1;

public class Facebook2 {
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		driver=browse1.obrowser("https://www.facebook.com/");
		System.out.println("Test Start");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	}
	@AfterMethod
	public void screenshot() throws IOException, InterruptedException {
		browse1.screen(driver, "Facebook");
		System.out.println("Test Complete");
//		Thread.sleep(500);
		driver.close();
	}
	
	@Test(priority = 4)
	public void test1() throws InterruptedException{
		Facebook Flogin =new Facebook(driver);
		Flogin.name("Lalit Rajput");
		Flogin.passward("9527303110");
		Flogin.login();
		System.out.println("test 1 ok");
//		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		Facebook woid =new Facebook(driver);
		woid.passward("9689084401");
		woid.login();
		System.out.println("test 2 ok");
//		Thread.sleep(2000);
	}
	@Test(priority = 3)
     public void test3() throws InterruptedException {
    	 Facebook wopass =new Facebook(driver);
    	 wopass.name("Lalit Sisodiya");
    	 wopass.login();
    	 System.out.println("test 3 ok");
//    	 Thread.sleep(2000);
     }
	@Test(priority = 1)
     public void test4() throws InterruptedException {
    	 Facebook Createacc =new Facebook(driver);
    	 Createacc.Createacc();
    	 System.out.println("test 4 ok");
//    	 Thread.sleep(2000);
     }
}
