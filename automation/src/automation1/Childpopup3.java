package automation1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Childpopup3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =browse1.obrowser("https://vctcpune.com/");
		WebElement selenium = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		selenium.click();
		selenium.click();
		selenium.click();
		selenium.click();
//		String homepage = driver.getWindowHandle();
		
		Set<String> page1=driver.getWindowHandles();
		Iterator<String> i =page1.iterator();
//		String h1= i.next();
//		System.out.println(h1);
//		driver.switchTo().window(h1);
//		=driver.getTitle()
		while (i.hasNext()) {
		Thread.sleep(2000);
		String h1=i.next();
		driver.switchTo().window(h1);
		String tital=driver.getTitle();
		if(tital.equals("Practice Page")) {
		WebElement radio =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio.click();
		WebElement name2 =driver.findElement(By.xpath("//input[@id='autocomplete']"));
		name2.sendKeys("Lalit");
		Thread.sleep(2000);
		WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alert.click();
		Alert a= driver.switchTo().alert();
		a.accept();
			}
		}
	}

}
