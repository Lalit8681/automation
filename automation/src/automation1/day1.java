package automation1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.javatpoint.com/how-to-print-pattern-in-java");
	
}
}
