package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static String DateTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy hh-mm-ss");
		LocalDateTime currenttime=LocalDateTime.now();
		String dt=dtf.format(currenttime);
		return  dt;
	}
	public static void TakeScreenShot(WebDriver driver, String name) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Date=ScreenShot.DateTime();
		File destination= new File("H:\\st\\KiteZerodhascreenShot\\"+ name +Date+".png");
		FileHandler.copy(source, destination);
	}
	

	
		
	}


