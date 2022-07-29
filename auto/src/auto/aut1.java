package auto;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class aut1 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("");
			driver.navigate().to("https://www.google.com/search?q=google+translate+english+to+spanish&rlz=1C1YTUH_enIN1005IN1005&oq=goo&aqs=chrome.2.69i57j0i271l3j69i60l4.2670j0j7&sourceid=chrome&ie=UTF-8");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	String tital = driver.getTitle();
	System.out.println(tital);
		
		}
			}
