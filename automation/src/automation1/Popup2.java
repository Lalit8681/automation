package automation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup2 {
	public static void main(String[] args) {
		WebDriver driver =browse1.obrowser("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement popup=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
//		popup.click();
//	Alert a=driver.switchTo().alert();
//	a.accept();
//	a.dismiss();
//	a.sendKeys("lalit");
//	a.sendKeys("Lalit");
//	a.accept();
//	String t =a.getText();
//	System.out.println(t);
		WebElement popup2 =driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		popup2.click();
		Alert b=driver.switchTo().alert();
		String c=b.getText();
		System.out.println(c);
		b.accept();
		
	
	}
	

}
