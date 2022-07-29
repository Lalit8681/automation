package automation1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pointclass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension d = new Dimension(1000,300);
		driver.manage().window().setSize(d);
		Point p= new Point(500,100);
		driver.manage().window().setPosition(p);
		
		
	}

}
