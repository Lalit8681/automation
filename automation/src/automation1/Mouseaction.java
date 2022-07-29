package automation1;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= browse1.obrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightc=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action= new Actions(driver);		
		action.contextClick(rightc);
		action.perform();
		Thread.sleep(1000);
		WebElement click =driver.findElement(By.xpath("//span[text()='Copy']"));
		action.click(click);
		action.perform();
		Thread.sleep(10000);
		browse1.screen(driver, "ck");
		System.out.println("kk");
//		Thread.sleep(10000);
//		driver.switchTo().alert().accept();
	}
}
