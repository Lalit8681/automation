package automation1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Childpopup2 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=browse1.obrowser("https://vctcpune.com/");
		WebElement seleniumpract=driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		seleniumpract.click();
		seleniumpract.click();
		seleniumpract.click();
		seleniumpract.click();
	
		String homepage=driver.getWindowHandle();
		System.out.println(homepage);
		
		Set<String> alltabadd=driver.getWindowHandles();
		Iterator<String> i=alltabadd.iterator();
		
//		Thread.sleep(1000);
		String h1 = i.next();
		System.out.println(h1);
		
		Thread.sleep(1000);
		String h2 = i.next();
		System.out.println(h2);
		
		Thread.sleep(1000);
		driver.switchTo().window(h2);
		String tital=driver.getTitle();
		
		if(tital.equals("Practice Page")) {
			WebElement name =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			name.click();
			WebElement name2 =driver.findElement(By.xpath("//input[@id='autocomplete']"));
			name2.sendKeys("Lalit");
		}
	}

}
