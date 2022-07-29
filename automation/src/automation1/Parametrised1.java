package automation1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parametrised1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver =browse1.obrowser("https://www.facebook.com");
		String name=browse1.parametric("Sheet1", 0, 0);
		System.out.println(name);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(name);
		String pass=browse1.parametric("Sheet1", 1, 0);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
		
	}

}
