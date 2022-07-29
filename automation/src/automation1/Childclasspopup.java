package automation1;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Childclasspopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =browse1.obrowser("https://vctcpune.com/");
		WebElement seleniumpractise =driver.findElement(By.xpath("(//a[@href=\"../selenium/practice.html\"])[1]"));
		seleniumpractise.click();
		seleniumpractise.click();
		seleniumpractise.click();
		seleniumpractise.click();
		
		String homepage =driver.getWindowHandle();
		System.out.println(homepage);
		
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> i=handle.iterator();
		
		Thread.sleep(3000);
		String handle1 =i.next();
		System.out.println(handle1);
		
		Thread.sleep(1000);
		String handle2 =i.next();
		System.out.println(handle2);

		String handle3 =i.next();
		System.out.println(handle3);
		
//		String handle4 =i.next();
//		System.out.println(handle4);
		
	}
	

}
