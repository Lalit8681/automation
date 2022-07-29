package auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver =forpract.openb("https://www.facebook.com/");
//		WebDriver driver1 =forpract.screen("H:\\st\\screenshots\\fb.png");
		File Sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("H:\\st\\screenshots\\fb.png");
		FileHandler.copy(Sourse, destination);
	}

}
