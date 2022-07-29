package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup1 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver =browse1.obrowser("https://www.facebook.com/");
		Thread.sleep(1000);
	WebElement createacc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	createacc.click();
	Thread.sleep(1000);
//	WebElement name =driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
//	name.click();
//	name.sendKeys("Lalit");
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("rajput");
	
	}

}
