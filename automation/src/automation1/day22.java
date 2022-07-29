package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class day22 {
	public static void main(String[] args) {
		WebDriver driver = day2.browser("https://www.google.com/search?q=google+translate+english+to+spanish&rlz=1C1YTUH_enIN1005IN1005&oq=goo&aqs=chrome.2.69i57j0i271l3j69i60l4.2670j0j7&sourceid=chrome&ie=UTF-8");
//		String tital = driver.getTitle();
//		System.out.println(driver.getTitle());
//		String url = driver.getCurrentUrl();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
//		driver.navigate().to(url);
		
	}

}
