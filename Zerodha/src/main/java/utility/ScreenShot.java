package utility;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot {
	public static void TakeScreenShot(WebDriver driver) throws IOException {
		File Sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("H:\\st\\screenshots\\" + "Zerodhatest" + ".png");
		FileHandler.copy(Sourse, Destination);
	}

}
