package automation1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
	public static  WebDriver browser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //upcasting crome driver to web driver
//	    driver.get(url);//get methods helps to webpage
		return driver;
//	driver.navigate().to(url);
		
		
	}
}
