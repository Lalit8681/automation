package automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Popup3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=browse1.obrowser("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement alertbox=driver.findElement(By.xpath("//button[@name='alertbox']"));
		alertbox.click();
		browse1.screen(driver, "sc1");
		Alert a =driver.switchTo().alert();
		String b =a.getText();
		System.out.println(b);
		a.accept();
		WebElement test = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		test.click();
//		Alert d = driver.switchTo().alert();
//		a.accept();
		a.dismiss();
	}

}
