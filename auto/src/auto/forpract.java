package auto;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class forpract {
	public static  WebDriver openb(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
				
	}
   public static void screen (WebDriver driver1, String name) throws IOException {
	 	File Sourse=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		String dt=forpract.time();
		File destination = new File("H:\\st\\screenshots\\"+name+"__"+dt +".png");
		FileHandler.copy(Sourse, destination);
  }
   
   public static String time() {
	  DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");
	 LocalDateTime currenttime= LocalDateTime.now();
	 String dt=dft.format(currenttime);
	 return dt;
	 
	 
   }
   
   
}
