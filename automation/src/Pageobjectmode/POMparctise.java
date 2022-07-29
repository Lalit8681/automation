package Pageobjectmode;

import org.openqa.selenium.WebDriver;

import automation1.browse1;

public class POMparctise {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =browse1.obrowser("https://www.google.com/");
		
		POM facebooklogin=new POM (driver);
		facebooklogin.opengoogle("www.kite.com");
		Thread.sleep(2000);
		facebooklogin.clickenter();
		Thread.sleep(2000);
		facebooklogin.openkite();
		
//		facebooklogin.email("9527303110");
//		facebooklogin.sendpass("9689084401");
//		facebooklogin.loginpage();
	}

}
